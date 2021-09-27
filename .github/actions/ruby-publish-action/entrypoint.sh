#!/bin/bash
cd clients/ruby/
make clean deps lint package
mkdir -p ~/.gem/
touch ~/.gem/credentials
echo "---" >> ~/.gem/credentials
echo ":rubygems_api_key: ${RUBYGEMS_TOKEN}" >> ~/.gem/credentials
chmod 0600 ~/.gem/credentials
make publish