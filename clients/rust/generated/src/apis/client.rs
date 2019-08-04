use std::rc::Rc;

use hyper;
use super::configuration::Configuration;

pub struct APIClient<C: hyper::client::Connect> {
  configuration: Rc<Configuration<C>>,
  console_api: Box<::apis::ConsoleApi>,
  cq_api: Box<::apis::CqApi>,
  crx_api: Box<::apis::CrxApi>,
  custom_api: Box<::apis::CustomApi>,
  sling_api: Box<::apis::SlingApi>,
}

impl<C: hyper::client::Connect> APIClient<C> {
  pub fn new(configuration: Configuration<C>) -> APIClient<C> {
    let rc = Rc::new(configuration);

    APIClient {
      configuration: rc.clone(),
      console_api: Box::new(::apis::ConsoleApiClient::new(rc.clone())),
      cq_api: Box::new(::apis::CqApiClient::new(rc.clone())),
      crx_api: Box::new(::apis::CrxApiClient::new(rc.clone())),
      custom_api: Box::new(::apis::CustomApiClient::new(rc.clone())),
      sling_api: Box::new(::apis::SlingApiClient::new(rc.clone())),
    }
  }

  pub fn console_api(&self) -> &::apis::ConsoleApi{
    self.console_api.as_ref()
  }

  pub fn cq_api(&self) -> &::apis::CqApi{
    self.cq_api.as_ref()
  }

  pub fn crx_api(&self) -> &::apis::CrxApi{
    self.crx_api.as_ref()
  }

  pub fn custom_api(&self) -> &::apis::CustomApi{
    self.custom_api.as_ref()
  }

  pub fn sling_api(&self) -> &::apis::SlingApi{
    self.sling_api.as_ref()
  }


}
