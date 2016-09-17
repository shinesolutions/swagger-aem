all: clean doc

clean:
	rm -rf doc

doc:
	bootprint openapi conf/api.yml doc/api/master/

doc-publish:
	gh-pages --dist doc/

tools:
	npm install -g bootprint bootprint-openapi gh-pages

tools-osx: tools
	brew install swagger-codegen

.PHONY: all clean doc doc-publish tools tools-osx
