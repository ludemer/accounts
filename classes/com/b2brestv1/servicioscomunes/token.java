/*
               File: ServiciosComunes.Token
        Description: Token
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:46.7
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.servicioscomunes ;
import com.b2brestv1.*;
import com.genexus.*;
import com.genexus.db.*;
import com.genexus.webpanels.*;
import java.sql.*;
import com.genexus.search.*;

@javax.servlet.annotation.WebServlet(urlPatterns = {"/servlet/com.b2brestv1.servicioscomunes.token", "/com.b2brestv1.servicioscomunes.token"})
public final  class token extends GXWebObjectStub
{
   protected void doExecute( com.genexus.internet.HttpContext context ) throws Exception
   {
      new token_impl(context).doExecute();
   }

   protected void init( com.genexus.internet.HttpContext context )
   {
      new token_impl(context).cleanup();
   }

   public String getServletInfo( )
   {
      return "Token";
   }

   protected boolean IntegratedSecurityEnabled( )
   {
      return false;
   }

   protected int IntegratedSecurityLevel( )
   {
      return 0;
   }

   protected String IntegratedSecurityPermissionPrefix( )
   {
      return "";
   }

}

