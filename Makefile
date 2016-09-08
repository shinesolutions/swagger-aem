ifndef SWAGGER_CODEGEN_JAR
	SWAGGER_CODEGEN = swagger-codegen
else
	SWAGGER_CODEGEN = java -jar $(SWAGGER_CODEGEN_JAR)
endif

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
