pipeline {
    agent any
stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean install package'
                sh 'pwd'
                sh 'ls'
                sh 'docker version'
                sh 'docker build -t mytest:112 .'

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

