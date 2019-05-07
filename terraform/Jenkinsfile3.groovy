node {
    stage("Clone a repo"){
        git 'https://github.com/farrukh90/meetup_resources.git'
    }
    ws("${workspace}/terraform/"){
        stage("Initialization"){
            sh "pwd"
    }
    stage("Terraform Plan"){
        sh "terraform plan -var-file=instance.tfvars"
    }
}