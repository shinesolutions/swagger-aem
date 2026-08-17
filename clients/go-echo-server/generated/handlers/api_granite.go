package handlers
import (
	"github.com/shinesolutions/swagger-aem/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// SslSetup - 
func (c *Container) SslSetup(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

