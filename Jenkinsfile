pipeline {
    agent any
stages {
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'pwd'
                sh 'ls'
                sh 'cd /var/lib/jenkins/workspace/ms_master/m1/src/main/src/resources/'
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

