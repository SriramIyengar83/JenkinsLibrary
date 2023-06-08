#!/usr/bin/env  groovy

import groovy.text.StreamingTemplatePipeline


def call(Map options) {
   def ret = [:]
   String template = libraryResource 'podTemplates/' + options.name + '.yaml'
   def engine = new StreamingTemplatePipeline()
   String agent = engine.createTemplate(template).make().toString()
   ret['cloud'] = "name of the cloud"
   ret['yaml']  = agent
   ret['name']  = "build"

return ret


}