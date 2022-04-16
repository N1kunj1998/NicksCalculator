pipeline {
    environment{
        imageName = ""
    }
    agent any

    stages {
        stage('Git clone') {
            steps {
                echo 'clone the repo'
                sh 'rm  -rf NicksCalculator'
                sh 'git clone https://github.com/N1kunj1998/NicksCalculator.git'
            }
        }
        stage('Maven Build') {
            steps {
                script {
                    sh 'mvn clean install'
                }
            }
        }
        stage('Test') {
            steps {
                script {
                    sh 'mvn test'
                }
            }
        }
        stage('Docker Build to Image') {
            steps {
                script {
                    imageName = docker.build "nikunj1998/nickscalculator:latest"
                }
            }
        }
        stage('Push Docker Image') {
            steps {
                script{
                    docker.withRegistry("",'docker-jenkins'){
                    imageName.push()
                    }

                }
            }
        }
        stage('Ansible pull docker image') {
            steps {
               ansiblePlaybook becomeUser: null, colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'deploy/inventory', playbook: 'deploy/playbook.yml', sudoUser: null
            }
        }
    }
}
