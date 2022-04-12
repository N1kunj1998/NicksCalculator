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
    }
}
