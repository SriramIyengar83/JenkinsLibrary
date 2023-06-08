#!/usr/bin/groovy

// This pipeline exists in the project, for example sake , includes this in the same repo
//Ideally have this in ur build project

@Library('jenkins_library@master')_ //This can be fond from jenkins settings

build-pipeline(name: "build-pod")

//This will call the build-pipeline groovy file which will set the appropriate pod from pod Templates folder

