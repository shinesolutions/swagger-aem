LANGS = ruby python

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

$(LANGS):
	cd $@ && SWAGGER_CODEGEN_CLI_JAR=`ls ../bin/*.jar` make all && cd ..

build: $(LANGS)

.PHONY: $(LANGS) all build clean doc doc-publish tools tools-osx
