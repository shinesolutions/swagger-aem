import swaggeraem
import swaggeraem.configuration

def init_client():
  swaggeraem.configuration.username = 'admin'
  swaggeraem.configuration.password = 'admin'
  return swaggeraem.ApiClient('http://localhost:4502')
