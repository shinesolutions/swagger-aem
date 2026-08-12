#!/bin/bash
set -o nounset

cd ../
make build-javascript
cd examples/

npm link ../clients/javascript/generated/

node usage-javascript.js
