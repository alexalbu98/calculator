pipeline {
	agent java-1.8

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