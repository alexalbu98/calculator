pipeline {
	agent any

	environment {
		 PATH = "${env.PATH}:/opt/apache-maven-3.9.2/bin/"
	}

	stages {

		stage('Build'){
			steps {
				sh "mvn clean install -DskipTests"
			}
		}

		stage('Test'){
			steps{
				sh "mvn test"
			}
		}

		stage('Deploy') {
			steps {
			    echo "Deploying..."
			}
		}
	}
}