terraform {
  required_providers {
    example = {
      source = "registry.terraform.io/example/example"
    }
  }
}

provider "example" {
  endpoint = "http://localhost"
  # api_key  = "your-api-key"
  # token    = "your-bearer-token"
}
