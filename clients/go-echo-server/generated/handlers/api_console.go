package handlers
import (
	"github.com/shinesolutions/swagger-aem/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetAemProductInfo - 
func (c *Container) GetAemProductInfo(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetBundleInfo - 
func (c *Container) GetBundleInfo(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetConfigMgr - 
func (c *Container) GetConfigMgr(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PostBundle - 
func (c *Container) PostBundle(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PostJmxRepository - 
func (c *Container) PostJmxRepository(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PostSamlConfiguration - 
func (c *Container) PostSamlConfiguration(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

