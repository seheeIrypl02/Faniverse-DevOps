FROM jenkins/jenkins:lts-slim
USER root
RUN apt-get -y update && \
    apt-get -y install software-properties-common wget curl build-essential sudo apt-utils && \
    add-apt-repository ppa:openjdk-r/ppa && \
    apt-get -y update && \
    apt-get -y install openjdk-21-jdk gradle && \
    apt-get clean
RUN wget -qO- https://get.docker.com/ | sh
RUN usermod -aG docker jenkins
USER jenkins

