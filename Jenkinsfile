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
          bat 'mvn sonar:sonar -Dsonar.projectKey=pipeline_jenkins -Dsonar.login=906fac9a8e8c4f02a986f73db71507e66d803fb3'
        }
      }
    }
    stage("Quality Gate Statuc Check"){
      steps{
        timeout(time: 1, unit: 'HOURS'){
          waitForQualityGate abortPipeline: true
          script{
                def qg = waitForQualityGate(credentialsId: '906fac9a8e8c4f02a986f73db71507e66d803fb3') // Waiting for analysis to be completed
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
