pipeline {
    agent any
stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'pwd'
                sh 'ls'
                sh 'docker version'
                sh 'sudo docker build -t mytest:112 .'

                }
        }
        stage('Test') {
            steps {
                echo 'Testing..'}
        }
        stage('Deploy') {
            steps {
                echo 'Deploying....'}
        }
    }
}

