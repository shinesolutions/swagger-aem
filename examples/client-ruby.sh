#!/bin/bash
set -o nounset

cd ../
make build-ruby
cd examples/

ruby usageruby.rb
