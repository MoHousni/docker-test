pipeline {
  agent any
  stages{
    stage('build'){
      steps{
        bat 'mvn -B -DskipTests clean package'
      }
    }
    stage('SonarQube-analyse'){
      steps{
        withSonarQubeEnv('sonar') {
          bat 'mvn sonar:sonar -Dsonar.projectKey=test-project -Dsonar.host.url=http://localhost:9000 -Dsonar.login=0476497319b3257464ad9bfa4cd2b33d921a852e'
        }
      }
    }
    stage("Quality Gate Statuc Check"){
      steps{
        timeout(time: 1, unit: 'HOURS'){
          script{
                def qg = waitForQualityGate(credentialsId: '0476497319b3257464ad9bfa4cd2b33d921a852e') // Waiting for analysis to be completed
                if(qg.status != 'OK'){ // If quality gate was not met, then present error
                    error "Pipeline aborted due to quality gate failure: ${qg.status}"
                }
            }
        }
      }
    }
    stage('Email-Notification'){
      steps{
        mail bcc: '', body: 'Hello and see you later', cc: '', from: '', replyTo: '', subject: 'email for jenkins test pipeline', to: 'mohamedhousni1996@gmail.com'
      }
  }
}
}
