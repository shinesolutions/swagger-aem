package handlers
import (
	"github.com/shinesolutions/swagger-aem/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetAemHealthCheck - 
func (c *Container) GetAemHealthCheck(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PostConfigAemHealthCheckServlet - 
func (c *Container) PostConfigAemHealthCheckServlet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PostConfigAemPasswordReset - 
func (c *Container) PostConfigAemPasswordReset(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

