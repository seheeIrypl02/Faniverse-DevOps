node {
	def app
	stage('Clone repository') {
	git 'https://github.com/seheeIrypl02/Faniverse-DevOps.git'
 	}
	stage('Build image') {
		app = docker.build("iryplsehee02/faniverse-devops")
 	}
 	stage('Test image') {
 		app.inside{
 			sh'gradle test'
 		}
 	}
 	stage('Push image') {
 		docker.withRegistry('https://registry.hub.docker.com', 'iryplsehee02') {
 			app.push("${env.BUILD_NUMBER}")
 			app.push("latest")
 		}
 	}
}

pipeline {
    agent any
    stages {
        stage('Checkout') {
            steps {
                git branch: 'main', url: 'https://github.com/seheeIrypl02/Faniverse-DevOps.git'
            }
        }
        stage('Build') {
            steps {
                echo 'Building...'
            }
        }
    }
}
