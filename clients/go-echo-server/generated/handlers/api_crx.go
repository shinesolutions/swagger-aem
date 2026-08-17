package handlers
import (
	"github.com/shinesolutions/swagger-aem/models"
	"github.com/labstack/echo/v4"
	"net/http"
)

// GetCrxdeStatus - 
func (c *Container) GetCrxdeStatus(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetInstallStatus - 
func (c *Container) GetInstallStatus(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// GetPackageManagerServlet - 
func (c *Container) GetPackageManagerServlet(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PostPackageService - 
func (c *Container) PostPackageService(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PostPackageServiceJson - 
func (c *Container) PostPackageServiceJson(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PostPackageUpdate - 
func (c *Container) PostPackageUpdate(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}


// PostSetPassword - 
func (c *Container) PostSetPassword(ctx echo.Context) error {
	return ctx.JSON(http.StatusOK, models.HelloWorld {
		Message: "Hello World",
	})
}

