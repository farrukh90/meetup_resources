node {
    stage("Clone a repo"){
        git 'https://github.com/farrukh90/meetup_resources.git'
    }
    stage("Initialization"){
        sh "cd terraform && terraform get && terraform init"
    }
    stage("Terraform Plan"){
        sh "cd terraform && terraform apply -var-file=instance.tfvars --auto-approve"
    }
}