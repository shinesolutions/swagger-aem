all: deps clean install test-unit test-integration doc
ci: deps clean install test-unit doc

deps:
	pip3 install -r requirements-dev.txt
	cd generated/ && \
	  pip3 install -r requirements.txt

clean:
	
install:
	cd generated/ && \
	  python3 setup.py install

test-unit:
	cd generated/ && \
	  nosetests

test-integration:
	nosetests

doc:
	cd generated/ && \
	  sphinx-apidoc -o ../../doc/python/master/stage/ --full -H "Swagger AEM" -A "Shine Solutions" swaggeraem && \
		cd ../../doc/python/master/stage/ && \
		make html && \
		cd .. && \
		cp -R stage/_build/html/* ./ && \
		rm -rf stage/

publish:
	cd generated/ && \
	  python3 setup.py register -r pypi && \
	  python3 setup.py sdist upload -r pypi

publish-test:
	cd generated/ && \
	  python3 setup.py register -r pypitest && \
	  python3 setup.py sdist upload -r pypitest

.PHONY: all deps clean install test-unit test-integration doc publish publish-test
