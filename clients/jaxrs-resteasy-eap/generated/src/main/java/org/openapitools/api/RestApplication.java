package org.openapitools.api;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import java.util.Set;
import java.util.HashSet;

import org.openapitools.api.impl.CqactionsHtmlApiServiceImpl;
import org.openapitools.api.impl.AppsApiServiceImpl;
import org.openapitools.api.impl.BinApiServiceImpl;
import org.openapitools.api.impl.CrxApiServiceImpl;
import org.openapitools.api.impl.DefaultApiServiceImpl;
import org.openapitools.api.impl.EtcApiServiceImpl;
import org.openapitools.api.impl.LibsApiServiceImpl;
import org.openapitools.api.impl.SystemApiServiceImpl;

@ApplicationPath("")
public class RestApplication extends Application {


    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new HashSet<Class<?>>();
        resources.add(CqactionsHtmlApiServiceImpl.class);
        resources.add(AppsApiServiceImpl.class);
        resources.add(BinApiServiceImpl.class);
        resources.add(CrxApiServiceImpl.class);
        resources.add(DefaultApiServiceImpl.class);
        resources.add(EtcApiServiceImpl.class);
        resources.add(LibsApiServiceImpl.class);
        resources.add(SystemApiServiceImpl.class);

        return resources;
    }




}