/*
               File: getApiUrl
        Description: Tomar los datos de conexion desde archivo
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:45.16
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.servicioscomunes ;
import com.b2brestv1.*;
import java.sql.*;
import com.genexus.db.*;
import com.genexus.*;
import com.genexus.search.*;

public final  class getapiurl extends GXProcedure
{
   public getapiurl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( getapiurl.class ), "" );
   }

   public getapiurl( int remoteHandle ,
                     ModelContext context )
   {
      super( remoteHandle , context, "" );
   }

   public String executeUdp( String aP0 )
   {
      getapiurl.this.AV9prop = aP0;
      getapiurl.this.aP1 = aP1;
      getapiurl.this.aP1 = new String[] {""};
      initialize();
      privateExecute();
      return aP1[0];
   }

   public void execute( String aP0 ,
                        String[] aP1 )
   {
      execute_int(aP0, aP1);
   }

   private void execute_int( String aP0 ,
                             String[] aP1 )
   {
      getapiurl.this.AV9prop = aP0;
      getapiurl.this.aP1 = aP1;
      initialize();
      /* GeneXus formulas */
      /* Output device settings */
      privateExecute();
   }

   private void privateExecute( )
   {
      AV8file.setSource( "wkg.url.properties" );
      AV8file.open("");
      AV10Properties.fromJSonString(AV8file.readAllText(""), null);
      AV8file.close();
      AV11Property = (com.genexus.util.GXProperty)AV10Properties.first();
      while ( ! AV10Properties.eof() )
      {
         if ( GXutil.strcmp(AV11Property.getKey(), AV9prop) == 0 )
         {
            AV12val = AV11Property.getValue() ;
            returnInSub = true;
            cleanup();
            if (true) return;
         }
         AV11Property = (com.genexus.util.GXProperty)AV10Properties.next();
      }
      System.out.println( GXutil.trim( AV16Pgmname)+" -> Propiedad: {"+AV9prop+"} no encontrada en archivo wkg.url.properties" );
      cleanup();
   }

   protected void cleanup( )
   {
      this.aP1[0] = getapiurl.this.AV12val;
      CloseOpenCursors();
      exitApplication();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      AV12val = "" ;
      AV8file = new com.genexus.util.GXFile();
      AV10Properties = new com.genexus.util.GXProperties();
      AV11Property = new com.genexus.util.GXProperty();
      AV16Pgmname = "" ;
      AV16Pgmname = "ServiciosComunes.getApiUrl" ;
      /* GeneXus formulas. */
      AV16Pgmname = "ServiciosComunes.getApiUrl" ;
      Gx_err = (short)(0) ;
   }

   private short Gx_err ;
   private String AV9prop ;
   private String AV12val ;
   private String AV16Pgmname ;
   private boolean returnInSub ;
   private com.genexus.util.GXFile AV8file ;
   private String[] aP1 ;
   private com.genexus.util.GXProperties AV10Properties ;
   private com.genexus.util.GXProperty AV11Property ;
}

