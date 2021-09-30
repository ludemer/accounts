/*
               File: accounts.SdtOwner
        Description: Owner
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:24.18
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.b2brestv1.*;
import com.genexus.*;
import com.genexus.xml.*;
import com.genexus.search.*;
import com.genexus.webpanels.*;
import java.util.*;

public final  class SdtOwner extends GXXMLSerializable implements Cloneable, java.io.Serializable
{
   public SdtOwner( )
   {
      this(  new ModelContext(SdtOwner.class));
   }

   public SdtOwner( ModelContext context )
   {
      super( context, "SdtOwner");
   }

   public SdtOwner( int remoteHandle ,
                    ModelContext context )
   {
      super( remoteHandle, context, "SdtOwner");
   }

   public SdtOwner( StructSdtOwner struct )
   {
      this();
      setStruct(struct);
   }

   private static java.util.HashMap mapper = new java.util.HashMap();
   static
   {
   }

   public String getJsonMap( String value )
   {
      return (String) mapper.get(value);
   }

   public short readxml( com.genexus.xml.XMLReader oReader ,
                         String sName )
   {
      short GXSoapError = 1;
      formatError = false ;
      sTagName = oReader.getName() ;
      if ( oReader.getIsSimple() == 0 )
      {
         GXSoapError = oReader.read() ;
         nOutParmCount = (short)(0) ;
         while ( ( ( GXutil.strcmp(oReader.getName(), sTagName) != 0 ) || ( oReader.getNodeType() == 1 ) ) && ( GXSoapError > 0 ) )
         {
            readOk = (short)(0) ;
            if ( GXutil.strcmp2( oReader.getLocalName(), "email") )
            {
               gxTv_SdtOwner_Email = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "firstName") )
            {
               gxTv_SdtOwner_Firstname = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "lastName") )
            {
               gxTv_SdtOwner_Lastname = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            if ( GXutil.strcmp2( oReader.getLocalName(), "phone") )
            {
               gxTv_SdtOwner_Phone = oReader.getValue() ;
               if ( GXSoapError > 0 )
               {
                  readOk = (short)(1) ;
               }
               GXSoapError = oReader.read() ;
            }
            nOutParmCount = (short)(nOutParmCount+1) ;
            if ( ( readOk == 0 ) || formatError )
            {
               context.globals.sSOAPErrMsg += "Error reading " + sTagName + GXutil.newLine( ) ;
               context.globals.sSOAPErrMsg += "Message: " + oReader.readRawXML() ;
               GXSoapError = (short)(nOutParmCount*-1) ;
            }
         }
      }
      return GXSoapError ;
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace )
   {
      writexml(oWriter, sName, sNameSpace, true);
   }

   public void writexml( com.genexus.xml.XMLWriter oWriter ,
                         String sName ,
                         String sNameSpace ,
                         boolean sIncludeState )
   {
      if ( (GXutil.strcmp("", sName)==0) )
      {
         sName = "Owner" ;
      }
      if ( (GXutil.strcmp("", sNameSpace)==0) )
      {
         sNameSpace = "B2BRestV1" ;
      }
      oWriter.writeStartElement(sName);
      if ( GXutil.strcmp(GXutil.left( sNameSpace, 10), "[*:nosend]") != 0 )
      {
         oWriter.writeAttribute("xmlns", sNameSpace);
      }
      else
      {
         sNameSpace = GXutil.right( sNameSpace, GXutil.len( sNameSpace)-10) ;
      }
      oWriter.writeElement("email", GXutil.rtrim( gxTv_SdtOwner_Email));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("firstName", GXutil.rtrim( gxTv_SdtOwner_Firstname));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("lastName", GXutil.rtrim( gxTv_SdtOwner_Lastname));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeElement("phone", GXutil.rtrim( gxTv_SdtOwner_Phone));
      if ( GXutil.strcmp(sNameSpace, "B2BRestV1") != 0 )
      {
         oWriter.writeAttribute("xmlns", "B2BRestV1");
      }
      oWriter.writeEndElement();
   }

   public void tojson( )
   {
      tojson( true) ;
   }

   public void tojson( boolean includeState )
   {
      tojson( includeState, true) ;
   }

   public void tojson( boolean includeState ,
                       boolean includeNonInitialized )
   {
      AddObjectProperty("email", gxTv_SdtOwner_Email, false, false);
      AddObjectProperty("firstName", gxTv_SdtOwner_Firstname, false, false);
      AddObjectProperty("lastName", gxTv_SdtOwner_Lastname, false, false);
      AddObjectProperty("phone", gxTv_SdtOwner_Phone, false, false);
   }

   public String getgxTv_SdtOwner_Email( )
   {
      return gxTv_SdtOwner_Email ;
   }

   public void setgxTv_SdtOwner_Email( String value )
   {
      gxTv_SdtOwner_Email = value ;
   }

   public String getgxTv_SdtOwner_Firstname( )
   {
      return gxTv_SdtOwner_Firstname ;
   }

   public void setgxTv_SdtOwner_Firstname( String value )
   {
      gxTv_SdtOwner_Firstname = value ;
   }

   public String getgxTv_SdtOwner_Lastname( )
   {
      return gxTv_SdtOwner_Lastname ;
   }

   public void setgxTv_SdtOwner_Lastname( String value )
   {
      gxTv_SdtOwner_Lastname = value ;
   }

   public String getgxTv_SdtOwner_Phone( )
   {
      return gxTv_SdtOwner_Phone ;
   }

   public void setgxTv_SdtOwner_Phone( String value )
   {
      gxTv_SdtOwner_Phone = value ;
   }

   public void initialize( int remoteHandle )
   {
      initialize( ) ;
   }

   public void initialize( )
   {
      gxTv_SdtOwner_Email = "" ;
      gxTv_SdtOwner_Firstname = "" ;
      gxTv_SdtOwner_Lastname = "" ;
      gxTv_SdtOwner_Phone = "" ;
      sTagName = "" ;
   }

   public com.b2brestv1.accounts.SdtOwner Clone( )
   {
      return (com.b2brestv1.accounts.SdtOwner)(clone()) ;
   }

   public void setStruct( com.b2brestv1.accounts.StructSdtOwner struct )
   {
      setgxTv_SdtOwner_Email(struct.getEmail());
      setgxTv_SdtOwner_Firstname(struct.getFirstname());
      setgxTv_SdtOwner_Lastname(struct.getLastname());
      setgxTv_SdtOwner_Phone(struct.getPhone());
   }

   @SuppressWarnings("unchecked")
   public com.b2brestv1.accounts.StructSdtOwner getStruct( )
   {
      com.b2brestv1.accounts.StructSdtOwner struct = new com.b2brestv1.accounts.StructSdtOwner ();
      struct.setEmail(getgxTv_SdtOwner_Email());
      struct.setFirstname(getgxTv_SdtOwner_Firstname());
      struct.setLastname(getgxTv_SdtOwner_Lastname());
      struct.setPhone(getgxTv_SdtOwner_Phone());
      return struct ;
   }

   protected short readOk ;
   protected short nOutParmCount ;
   protected String sTagName ;
   protected boolean formatError ;
   protected String gxTv_SdtOwner_Email ;
   protected String gxTv_SdtOwner_Firstname ;
   protected String gxTv_SdtOwner_Lastname ;
   protected String gxTv_SdtOwner_Phone ;
}

