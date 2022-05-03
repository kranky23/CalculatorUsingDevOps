    pipeline {
    		agent any
        stages {
            stage('Git Pull') {
                steps {
                    // Get code from a GitHub repository
                    // Make sure to add your own git url and credentialsId
    				git url: 'https://github.com/kranky23/CalculatorUsingDevOps.git', branch: 'main',
                     credentialsId: 'jenkins_demo'
                }
            }
            stage('Maven Build') {
                steps {
                    // Maven build, 'sh' specifies it is a shell command
                    sh 'mvn clean install'
                }
            }
            stage ('Build Docker image') {
                steps {
                    sh 'docker build -t kranky23/speminiproj:latest .'
//                     sh 'docker tag kranky23/speminiproj'
                    echo 'Docker image built '
                }
            }

            stage ('Docker login and Push image to docker hub') {
                steps {
                    withCredentials([string(credentialsId: '12', variable: 'dockerpwd')]) {
        // some block
                        //sh 'docker login -u kranky23 -p $(dockerpwd)'

                        sh 'cat ~/my_password.txt | docker login --username kranky23 --password-stdin'

                        sh 'docker push kranky23/speminiproj'
                    }
                }
            }

//             stage('Ansible Deploy') {
//                 steps {
//                     //Ansible Deploy to remote server (managed host)
//                     ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'p2.yml'
//
//                 }
//             }

            stage('Ansible deploy and Pull Image from docker hub ') {
                steps {
                    //Ansible Deploy to remote server (managed host)
                    ansiblePlaybook colorized: true, disableHostKeyChecking: true, installation: 'Ansible', inventory: 'inventory', playbook: 'pull.yml'
                    echo 'Image pulled successfully'
                }
            }
        }
    }