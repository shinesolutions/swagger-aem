package handlers
import (
	"github.com/shinesolutions/swagger-aem/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetLoginPage - 
func (c *Container) GetLoginPage(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PostCqActions - 
func (c *Container) PostCqActions(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

