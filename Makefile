LANGS = ruby python

all: clean doc

clean:
	rm -rf doc

doc:
	bootprint openapi conf/api.yml doc/api/master/

doc-publish:
	gh-pages --dist doc/

lint:
	swagger validate conf/*.yml

tools:
	npm install -g bootprint bootprint-openapi gh-pages swagger-cli

tools-osx: tools
	brew install swagger-codegen

$(LANGS):
	cd $@ && SWAGGER_CODEGEN_CLI_JAR=`ls ../bin/*.jar` make all && cd ..

build: $(LANGS)

.PHONY: $(LANGS) all build clean doc doc-publish lint tools tools-osx
