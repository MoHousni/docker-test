pipeline {
  agent any
  stages{
    stage('SCM checkout'){
      git 'https://github.com/MoHousni/docker-test'
    }
    stage('build'){
      sh 'mvn package'
    }
  }
}
