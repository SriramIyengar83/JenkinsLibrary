#!/usr/bin/groovy
//This exists in the Jenkins Library

def call(Map propertyInfo) {

    pipeline {
       
       agent {
           kubeAgent(name: propertyInfo.agent)
       }
       
       stages {
       //mention stages here

       }

    }
}