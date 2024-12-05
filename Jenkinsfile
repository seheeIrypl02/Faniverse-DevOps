node {
	def app
	stage('Clone repository') {
	git branch: 'main', url: 'https://github.com/seheeIrypl02/Faniverse-DevOps.git'
 	}
	stage('Build image') {
		app = docker.build("iryplsehee02/faniverse-devops")
 	}
 	stage('Test image') {
 		dir('backend-repo/FaniverseBE') {
			sh 'chmod +x gradlew'
			sh './gradlew clean build test'
		}
	}
 	stage('Push image') {
 		docker.withRegistry('https://registry.hub.docker.com', 'iryplsehee02') {
 			app.push("${env.BUILD_NUMBER}")
 			app.push("latest")
 		}
 	}
}
