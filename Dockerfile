FROM circleci/openjdk:8-jdk-browsers

RUN sudo apt-get update && \
    sudo apt-get install -y python-pip python-dev apt-transport-https && \
    sudo pip install awscli

RUN sudo curl -s https://packages.cloud.google.com/apt/doc/apt-key.gpg | sudo apt-key add - && \
    echo "deb http://apt.kubernetes.io/ kubernetes-xenial main" | sudo tee -a /etc/apt/sources.list.d/kubernetes.list && \
    sudo apt-get update && \
    sudo apt-get install -y kubectl

ENV PATH="$HOME/.bin:$PATH"

RUN mkdir -p $HOME/.bin && \
    curl -o $HOME/.bin/aws-iam-authenticator https://amazon-eks.s3-us-west-2.amazonaws.com/1.10.3/2018-07-26/bin/linux/amd64/aws-iam-authenticator && \
    chmod +x $HOME/.bin/aws-iam-authenticator

RUN aws --version
RUN $HOME/.bin/aws-iam-authenticator help