pipeline {
    agent any
    environment {
    		DOCKERHUB_CREDENTIALS=credentials('docker-creds')
    	}
stages {

	stage('Login') {

			steps {
				sh 'echo $DOCKERHUB_CREDENTIALS_PSW | docker login -u $DOCKERHUB_CREDENTIALS_USR --password-stdin'
			}
		}
        stage('Build') {
            steps {
                echo 'Building..'
                sh 'mvn clean install package -DskipTests'
                sh 'pwd'
                sh 'ls'
                sh 'docker version'
                sh 'docker build -t mytest:113 .'

                }
        }

        stage('tag preparation stage') {

                			steps {
                			//   docker tag imagename:version username/reponame:inagename
                				sh 'docker tag mytest:113 veerujava1986/test:mytest'
                			}
                		}
        stage('Push') {

        			steps {
        				sh 'docker push veerujava1986/test:mytest'
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


    post {
    		always {
    			sh 'docker logout'
    			sh 'kubectl get ns'
    		}
    	}
}

