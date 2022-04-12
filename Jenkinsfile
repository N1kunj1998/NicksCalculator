pipeline {
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
    }
}
