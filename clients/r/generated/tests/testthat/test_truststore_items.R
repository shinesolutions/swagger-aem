# Automatically generated by openapi-generator (https://openapi-generator.tech)
# Please update as you see appropriate

context("Test TruststoreItems")

model.instance <- TruststoreItems$new()

test_that("alias", {
  # tests for the property `alias` (character)
  # Truststore alias name

  # uncomment below to test the property 
  #expect_equal(model.instance$`alias`, "EXPECTED_RESULT")
})

test_that("entryType", {
  # tests for the property `entryType` (character)

  # uncomment below to test the property 
  #expect_equal(model.instance$`entryType`, "EXPECTED_RESULT")
})

test_that("subject", {
  # tests for the property `subject` (character)
  # e.g. \&quot;CN&#x3D;localhost\&quot;

  # uncomment below to test the property 
  #expect_equal(model.instance$`subject`, "EXPECTED_RESULT")
})

test_that("issuer", {
  # tests for the property `issuer` (character)
  # e.g. \&quot;CN&#x3D;Admin\&quot;

  # uncomment below to test the property 
  #expect_equal(model.instance$`issuer`, "EXPECTED_RESULT")
})

test_that("notBefore", {
  # tests for the property `notBefore` (character)
  # e.g. \&quot;Sun Jul 01 12:00:00 AEST 2018\&quot;

  # uncomment below to test the property 
  #expect_equal(model.instance$`notBefore`, "EXPECTED_RESULT")
})

test_that("notAfter", {
  # tests for the property `notAfter` (character)
  # e.g. \&quot;Sun Jun 30 23:59:50 AEST 2019\&quot;

  # uncomment below to test the property 
  #expect_equal(model.instance$`notAfter`, "EXPECTED_RESULT")
})

test_that("serialNumber", {
  # tests for the property `serialNumber` (integer)
  # 18165099476682912368

  # uncomment below to test the property 
  #expect_equal(model.instance$`serialNumber`, "EXPECTED_RESULT")
})

