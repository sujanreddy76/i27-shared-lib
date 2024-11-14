import com.i26academy.builds.Calculator

def call(Map pipelineParams){
    //Object/instance of the calculator class
    Calculator calculator=new Calculator(this)
  pipeline {
    agent {
        label 'java-label'
    }
    environment {
        APPLICATION_NAME = "${pipelineParams.appName}"
    }
    stages {
        stage('Calculate'){
            steps{
                script{
                    echo "Calling calculator method from src folder"
                    echo "*********Printing the sum of values ****************"
                    println calculator.add(2,3)
                }
            }

        }
        stage('Build') {
            steps {
                echo "Building the project"
            }
        }
        stage('Test') {
            steps {
                echo "Testing the project"
            }
        }
        stage('DevDeploy') {
            steps {
                echo "Deploying the project to Dev environment"
            }
        }
         stage('TestDeploy') {
            steps {
                echo "Deploying the project to Test environment"
            }
        }
         stage('ProdDeploy') {
            steps {
                echo "Deploying the project to Prod environment"
            }
        }
    }
  }
}

def cal(firstNumber,secondNumber){
    return firstNumber+secondNumber
}

//${variable} //If we defined normal variable then we call this way
//${env.VARIABLE} //If we defined environment variable then we call this way
//${parms.VARIABLE} //If we defined parameters then we call this way
//${pipelineParams.VARIABLE} //If we implement shared library the if one project has to call variable from another project then we will use 'pipelineParams'

