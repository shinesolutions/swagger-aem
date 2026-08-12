#!/bin/bash
set -o nounset

cd ../
make build-python
cd examples/

. ../clients/python/generated/.venv/bin/activate

python usage_python.py
