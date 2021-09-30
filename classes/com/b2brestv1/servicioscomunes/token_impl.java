/*
               File: servicioscomunes.token_impl
        Description: Token
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:13:46.8
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

public final  class token_impl extends GXDataArea
{
   public void initenv( )
   {
      if ( GxWebError != 0 )
      {
         return  ;
      }
   }

   public void inittrn( )
   {
      initialize_properties( ) ;
      entryPointCalled = false ;
      gxfirstwebparm = httpContext.GetNextPar( ) ;
      gxfirstwebparm_bkp = gxfirstwebparm ;
      gxfirstwebparm = httpContext.DecryptAjaxCall( gxfirstwebparm) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      if ( GXutil.strcmp(gxfirstwebparm, "dyncall") == 0 )
      {
         httpContext.setAjaxCallMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         dyncall( httpContext.GetNextPar( )) ;
         return  ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxajaxEvt") == 0 )
      {
         httpContext.setAjaxEventMode();
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else if ( GXutil.strcmp(gxfirstwebparm, "gxfullajaxEvt") == 0 )
      {
         if ( ! httpContext.IsValidAjaxCall( true) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = httpContext.GetNextPar( ) ;
      }
      else
      {
         if ( ! httpContext.IsValidAjaxCall( false) )
         {
            GxWebError = (byte)(1) ;
            return  ;
         }
         gxfirstwebparm = gxfirstwebparm_bkp ;
      }
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
      if ( (GXutil.strcmp("", httpContext.getCookie( "GX_SESSION_ID"))==0) )
      {
         gxcookieaux = httpContext.setCookie( "GX_SESSION_ID", httpContext.encrypt64( com.genexus.util.Encryption.getNewKey( ), context.getServerKey( )), "", GXutil.nullDate(), "", (short)(0)) ;
      }
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_web_controls( ) ;
      if ( toggleJsOutput )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.enableJsOutput();
         }
      }
      if ( ! httpContext.isSpaRequest( ) )
      {
         if ( httpContext.exposeMetadata( ) )
         {
            Form.getMeta().addItem("generator", "GeneXus Java 17_0_1-147395", (short)(0)) ;
         }
         Form.getMeta().addItem("description", "Token", (short)(0)) ;
      }
      httpContext.wjLoc = "" ;
      httpContext.nUserReturn = (byte)(0) ;
      httpContext.wbHandled = (byte)(0) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
      }
      if ( ! httpContext.isAjaxRequest( ) )
      {
         GX_FocusControl = edtTokenId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      wbErr = false ;
      httpContext.setDefaultTheme("Carmine");
      if ( ! httpContext.isLocalStorageSupported( ) )
      {
         httpContext.pushCurrentUrl();
      }
   }

   public token_impl( com.genexus.internet.HttpContext context )
   {
      super(context);
   }

   public token_impl( int remoteHandle )
   {
      super( remoteHandle , new ModelContext( token_impl.class ));
   }

   public token_impl( int remoteHandle ,
                      ModelContext context )
   {
      super( remoteHandle , context);
   }

   protected void createObjects( )
   {
   }

   public void webExecute( )
   {
      initenv( ) ;
      inittrn( ) ;
      if ( ( GxWebError == 0 ) && ! isAjaxCallMode( ) )
      {
         MasterPageObj= createMasterPage(remoteHandle, "com.b2brestv1.rwdmasterpage");
         MasterPageObj.setDataArea(this,false);
         validateSpaRequest();
         MasterPageObj.webExecute();
         if ( ( GxWebError == 0 ) && httpContext.isAjaxRequest( ) )
         {
            httpContext.enableOutput();
            if ( ! httpContext.isAjaxRequest( ) )
            {
               httpContext.GX_webresponse.addHeader("Cache-Control", "no-store");
            }
            if ( ! httpContext.willRedirect( ) )
            {
               addString( httpContext.getJSONResponse( )) ;
            }
            else
            {
               if ( httpContext.isAjaxRequest( ) )
               {
                  httpContext.disableOutput();
               }
               renderHtmlHeaders( ) ;
               httpContext.redirect( httpContext.wjLoc );
               httpContext.dispatchAjaxCommands();
            }
         }
      }
      if ( isAjaxCallMode( ) )
      {
         cleanup();
      }
   }

   public void fix_multi_value_controls( )
   {
   }

   public void draw( )
   {
      if ( httpContext.isAjaxRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( ! com.b2brestv1.GxWebStd.gx_redirect( httpContext) )
      {
         disable_std_buttons( ) ;
         enableDisable( ) ;
         set_caption( ) ;
         /* Form start */
         drawControls( ) ;
         fix_multi_value_controls( ) ;
      }
      /* Execute Exit event if defined. */
   }

   public void drawControls( )
   {
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "Section", "left", "top", " "+"data-gx-base-lib=\"bootstrapv3\""+" "+"data-abstract-form"+" ", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, divMaintable_Internalname, 1, 0, "px", 0, "px", "WWAdvancedContainer", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, divTitlecontainer_Internalname, 1, 0, "px", 0, "px", "TableTop", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      /* Text block */
      com.b2brestv1.GxWebStd.gx_label_ctrl( httpContext, lblTitle_Internalname, "Token", "", "", lblTitle_Jsonclick, "'"+""+"'"+",false,"+"'"+""+"'", "", "Title", 0, "", 1, 1, 0, (short)(0), "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "left", "top", "", "", "div");
      ClassString = "ErrorViewer" ;
      StyleString = "" ;
      com.b2brestv1.GxWebStd.gx_msg_list( httpContext, "", httpContext.GX_msglist.getDisplaymode(), StyleString, ClassString, "", "false");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 col-sm-8 col-sm-offset-2", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, divFormcontainer_Internalname, 1, 0, "px", 0, "px", "FormContainer", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, divToolbarcell_Internalname, 1, 0, "px", 0, "px", "col-xs-12 col-sm-9 col-sm-offset-3 ToolbarCellClass", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group ActionGroup", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "btn-group", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 21,'',false,'',0)\"" ;
      ClassString = "BtnFirst" ;
      StyleString = "" ;
      com.b2brestv1.GxWebStd.gx_button_ctrl( httpContext, bttBtn_first_Internalname, "", "", bttBtn_first_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_first_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EFIRST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 23,'',false,'',0)\"" ;
      ClassString = "BtnPrevious" ;
      StyleString = "" ;
      com.b2brestv1.GxWebStd.gx_button_ctrl( httpContext, bttBtn_previous_Internalname, "", "", bttBtn_previous_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_previous_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"EPREVIOUS."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 25,'',false,'',0)\"" ;
      ClassString = "BtnNext" ;
      StyleString = "" ;
      com.b2brestv1.GxWebStd.gx_button_ctrl( httpContext, bttBtn_next_Internalname, "", "", bttBtn_next_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_next_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ENEXT."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 27,'',false,'',0)\"" ;
      ClassString = "BtnLast" ;
      StyleString = "" ;
      com.b2brestv1.GxWebStd.gx_button_ctrl( httpContext, bttBtn_last_Internalname, "", "", bttBtn_last_Jsonclick, 5, "", "", StyleString, ClassString, bttBtn_last_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ELAST."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 29,'',false,'',0)\"" ;
      ClassString = "BtnSelect" ;
      StyleString = "" ;
      com.b2brestv1.GxWebStd.gx_button_ctrl( httpContext, bttBtn_select_Internalname, "", "Select", bttBtn_select_Jsonclick, 4, "Select", "", StyleString, ClassString, bttBtn_select_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ESELECT."+"'", TempTags, "gx.popup.openPrompt('"+"com.b2brestv1.servicioscomunes.gx03m0"+"',["+"{Ctrl:gx.dom.el('"+"TOKENID"+"'), id:'"+"TOKENID"+"'"+",IOType:'out',isKey:true,isLastKey:true}"+"],"+"null"+","+"'', false"+","+"true"+");"+"return false;", 2, "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCellAdvanced", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTokenId_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.b2brestv1.GxWebStd.gx_label_element( httpContext, edtTokenId_Internalname, "Id", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 34,'',false,'',0)\"" ;
      com.b2brestv1.GxWebStd.gx_single_line_edit( httpContext, edtTokenId_Internalname, GXutil.ltrim( localUtil.ntoc( A1216TokenId, (byte)(10), (byte)(0), ".", "")), ((edtTokenId_Enabled!=0) ? GXutil.ltrim( localUtil.format( DecimalUtil.doubleToDec(A1216TokenId), "ZZZZZZZZZ9")) : localUtil.format( DecimalUtil.doubleToDec(A1216TokenId), "ZZZZZZZZZ9")), TempTags+" onchange=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onchange(this, event)\" "+" onblur=\""+"gx.num.valid_integer( this,',');"+";gx.evt.onblur(this,34);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTokenId_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTokenId_Enabled, 0, "number", "1", 10, "chr", 1, "row", 10, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(0), true, "", "right", false, "", "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTokenPais_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.b2brestv1.GxWebStd.gx_label_element( httpContext, edtTokenPais_Internalname, "Pais", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 39,'',false,'',0)\"" ;
      com.b2brestv1.GxWebStd.gx_single_line_edit( httpContext, edtTokenPais_Internalname, GXutil.rtrim( A1217TokenPais), GXutil.rtrim( localUtil.format( A1217TokenPais, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,39);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTokenPais_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTokenPais_Enabled, 0, "text", "", 2, "chr", 1, "row", 2, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "Pais", "left", true, "", "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTokenFecha_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.b2brestv1.GxWebStd.gx_label_element( httpContext, edtTokenFecha_Internalname, "Fecha", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 44,'',false,'',0)\"" ;
      com.b2brestv1.GxWebStd.gx_single_line_edit( httpContext, edtTokenFecha_Internalname, GXutil.rtrim( A1218TokenFecha), GXutil.rtrim( localUtil.format( A1218TokenFecha, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,44);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTokenFecha_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTokenFecha_Enabled, 0, "text", "", 50, "chr", 1, "row", 50, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTokenTipo_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.b2brestv1.GxWebStd.gx_label_element( httpContext, edtTokenTipo_Internalname, "Tipo", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 49,'',false,'',0)\"" ;
      com.b2brestv1.GxWebStd.gx_single_line_edit( httpContext, edtTokenTipo_Internalname, A1220TokenTipo, GXutil.rtrim( localUtil.format( A1220TokenTipo, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,49);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTokenTipo_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTokenTipo_Enabled, 0, "text", "", 40, "chr", 1, "row", 40, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTokenRecibido_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.b2brestv1.GxWebStd.gx_label_element( httpContext, edtTokenRecibido_Internalname, "Recibido", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Multiple line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 54,'',false,'',0)\"" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      ClassString = "Attribute" ;
      StyleString = "" ;
      com.b2brestv1.GxWebStd.gx_html_textarea( httpContext, edtTokenRecibido_Internalname, A1219TokenRecibido, "", TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,54);\"", (short)(0), 1, edtTokenRecibido_Enabled, 0, 80, "chr", 10, "row", StyleString, ClassString, "", "", "2097152", -1, 0, "", "", (byte)(-1), true, "", "'"+""+"'"+",false,"+"'"+""+"'", 0, "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12 FormCell", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "form-group gx-form-group", "left", "top", ""+" data-gx-for=\""+edtTokenEnv_Internalname+"\"", "", "div");
      /* Attribute/Variable Label */
      com.b2brestv1.GxWebStd.gx_label_element( httpContext, edtTokenEnv_Internalname, "Env", "col-sm-3 AttributeLabel", 1, true, "");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-sm-9 gx-attribute", "left", "top", "", "", "div");
      /* Single line edit */
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 59,'',false,'',0)\"" ;
      com.b2brestv1.GxWebStd.gx_single_line_edit( httpContext, edtTokenEnv_Internalname, GXutil.rtrim( A1225TokenEnv), GXutil.rtrim( localUtil.format( A1225TokenEnv, "")), TempTags+" onchange=\""+""+";gx.evt.onchange(this, event)\" "+" onblur=\""+""+";gx.evt.onblur(this,59);\"", "'"+""+"'"+",false,"+"'"+""+"'", "", "", "", "", edtTokenEnv_Jsonclick, 0, "Attribute", "", "", "", "", 1, edtTokenEnv_Enabled, 0, "text", "", 3, "chr", 1, "row", 3, (byte)(0), (short)(0), 0, (byte)(1), (byte)(-1), (byte)(-1), true, "", "left", true, "", "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "row", "left", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "col-xs-12", "Center", "top", "", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-action-group Confirm", "left", "top", " "+"data-gx-actiongroup-type=\"toolbar\""+" ", "", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 64,'',false,'',0)\"" ;
      ClassString = "BtnEnter" ;
      StyleString = "" ;
      com.b2brestv1.GxWebStd.gx_button_ctrl( httpContext, bttBtn_enter_Internalname, "", "Confirm", bttBtn_enter_Jsonclick, 5, "Confirm", "", StyleString, ClassString, bttBtn_enter_Visible, bttBtn_enter_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EENTER."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 66,'',false,'',0)\"" ;
      ClassString = "BtnCancel" ;
      StyleString = "" ;
      com.b2brestv1.GxWebStd.gx_button_ctrl( httpContext, bttBtn_cancel_Internalname, "", "Cancel", bttBtn_cancel_Jsonclick, 1, "Cancel", "", StyleString, ClassString, bttBtn_cancel_Visible, 1, "standard", "'"+""+"'"+",false,"+"'"+"ECANCEL."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      /* Div Control */
      com.b2brestv1.GxWebStd.gx_div_start( httpContext, "", 1, 0, "px", 0, "px", "gx-button", "left", "top", "", "", "div");
      TempTags = "  onfocus=\"gx.evt.onfocus(this, 68,'',false,'',0)\"" ;
      ClassString = "BtnDelete" ;
      StyleString = "" ;
      com.b2brestv1.GxWebStd.gx_button_ctrl( httpContext, bttBtn_delete_Internalname, "", "Delete", bttBtn_delete_Jsonclick, 5, "Delete", "", StyleString, ClassString, bttBtn_delete_Visible, bttBtn_delete_Enabled, "standard", "'"+""+"'"+",false,"+"'"+"EDELETE."+"'", TempTags, "", httpContext.getButtonType( ), "HLP_ServiciosComunes\\Token.htm");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "Center", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
      com.b2brestv1.GxWebStd.gx_div_end( httpContext, "left", "top", "div");
   }

   public void userMain( )
   {
      standaloneStartup( ) ;
   }

   public void userMainFullajax( )
   {
      initenv( ) ;
      inittrn( ) ;
      userMain( ) ;
      draw( ) ;
      sendCloseFormHiddens( ) ;
   }

   public void standaloneStartup( )
   {
      standaloneStartupServer( ) ;
      disable_std_buttons( ) ;
      enableDisable( ) ;
      process( ) ;
   }

   public void standaloneStartupServer( )
   {
      httpContext.wbGlbDoneStart = (byte)(1) ;
      assign_properties_default( ) ;
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read saved SDTs. */
         /* Read saved values. */
         Z1216TokenId = localUtil.ctol( httpContext.cgiGet( "Z1216TokenId"), ".", ",") ;
         Z1217TokenPais = httpContext.cgiGet( "Z1217TokenPais") ;
         n1217TokenPais = ((GXutil.strcmp("", A1217TokenPais)==0) ? true : false) ;
         Z1218TokenFecha = httpContext.cgiGet( "Z1218TokenFecha") ;
         n1218TokenFecha = ((GXutil.strcmp("", A1218TokenFecha)==0) ? true : false) ;
         Z1220TokenTipo = httpContext.cgiGet( "Z1220TokenTipo") ;
         n1220TokenTipo = ((GXutil.strcmp("", A1220TokenTipo)==0) ? true : false) ;
         Z1225TokenEnv = httpContext.cgiGet( "Z1225TokenEnv") ;
         n1225TokenEnv = ((GXutil.strcmp("", A1225TokenEnv)==0) ? true : false) ;
         IsConfirmed = (short)(localUtil.ctol( httpContext.cgiGet( "IsConfirmed"), ".", ",")) ;
         IsModified = (short)(localUtil.ctol( httpContext.cgiGet( "IsModified"), ".", ",")) ;
         Gx_mode = httpContext.cgiGet( "Mode") ;
         /* Read variables values. */
         if ( ( ( localUtil.ctol( httpContext.cgiGet( edtTokenId_Internalname), ".", ",") < 0 ) ) || ( ( localUtil.ctol( httpContext.cgiGet( edtTokenId_Internalname), ".", ",") > 9999999999L ) ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_badnum"), 1, "TOKENID");
            AnyError = (short)(1) ;
            GX_FocusControl = edtTokenId_Internalname ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            wbErr = true ;
            A1216TokenId = 0 ;
            httpContext.ajax_rsp_assign_attri("", false, "A1216TokenId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1216TokenId), 10, 0));
         }
         else
         {
            A1216TokenId = localUtil.ctol( httpContext.cgiGet( edtTokenId_Internalname), ".", ",") ;
            httpContext.ajax_rsp_assign_attri("", false, "A1216TokenId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1216TokenId), 10, 0));
         }
         A1217TokenPais = httpContext.cgiGet( edtTokenPais_Internalname) ;
         n1217TokenPais = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1217TokenPais", A1217TokenPais);
         n1217TokenPais = ((GXutil.strcmp("", A1217TokenPais)==0) ? true : false) ;
         A1218TokenFecha = httpContext.cgiGet( edtTokenFecha_Internalname) ;
         n1218TokenFecha = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1218TokenFecha", A1218TokenFecha);
         n1218TokenFecha = ((GXutil.strcmp("", A1218TokenFecha)==0) ? true : false) ;
         A1220TokenTipo = httpContext.cgiGet( edtTokenTipo_Internalname) ;
         n1220TokenTipo = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1220TokenTipo", A1220TokenTipo);
         n1220TokenTipo = ((GXutil.strcmp("", A1220TokenTipo)==0) ? true : false) ;
         A1219TokenRecibido = httpContext.cgiGet( edtTokenRecibido_Internalname) ;
         n1219TokenRecibido = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1219TokenRecibido", A1219TokenRecibido);
         n1219TokenRecibido = ((GXutil.strcmp("", A1219TokenRecibido)==0) ? true : false) ;
         A1225TokenEnv = httpContext.cgiGet( edtTokenEnv_Internalname) ;
         n1225TokenEnv = false ;
         httpContext.ajax_rsp_assign_attri("", false, "A1225TokenEnv", A1225TokenEnv);
         n1225TokenEnv = ((GXutil.strcmp("", A1225TokenEnv)==0) ? true : false) ;
         /* Read subfile selected row values. */
         /* Read hidden variables. */
         GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
         standaloneNotModal( ) ;
      }
      else
      {
         standaloneNotModal( ) ;
         if ( GXutil.strcmp(gxfirstwebparm, "viewer") == 0 )
         {
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            A1216TokenId = GXutil.lval( httpContext.GetPar( "TokenId")) ;
            httpContext.ajax_rsp_assign_attri("", false, "A1216TokenId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1216TokenId), 10, 0));
            getEqualNoModal( ) ;
            Gx_mode = "DSP" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            disable_std_buttons_dsp( ) ;
            standaloneModal( ) ;
         }
         else
         {
            Gx_mode = "INS" ;
            httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
            standaloneModal( ) ;
         }
      }
   }

   public void process( )
   {
      if ( GXutil.strcmp(httpContext.getRequestMethod( ), "POST") == 0 )
      {
         /* Read Transaction buttons. */
         sEvt = httpContext.cgiGet( "_EventName") ;
         EvtGridId = httpContext.cgiGet( "_EventGridId") ;
         EvtRowId = httpContext.cgiGet( "_EventRowId") ;
         if ( GXutil.len( sEvt) > 0 )
         {
            sEvtType = GXutil.left( sEvt, 1) ;
            sEvt = GXutil.right( sEvt, GXutil.len( sEvt)-1) ;
            if ( GXutil.strcmp(sEvtType, "M") != 0 )
            {
               if ( GXutil.strcmp(sEvtType, "E") == 0 )
               {
                  sEvtType = GXutil.right( sEvt, 1) ;
                  if ( GXutil.strcmp(sEvtType, ".") == 0 )
                  {
                     sEvt = GXutil.left( sEvt, GXutil.len( sEvt)-1) ;
                     if ( GXutil.strcmp(sEvt, "ENTER") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_enter( ) ;
                        /* No code required for Cancel button. It is implemented as the Reset button. */
                     }
                     else if ( GXutil.strcmp(sEvt, "FIRST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_first( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "PREVIOUS") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_previous( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "NEXT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_next( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LAST") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_last( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "SELECT") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_select( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "DELETE") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        btn_delete( ) ;
                     }
                     else if ( GXutil.strcmp(sEvt, "LSCR") == 0 )
                     {
                        httpContext.wbHandled = (byte)(1) ;
                        afterkeyloadscreen( ) ;
                     }
                  }
                  else
                  {
                  }
               }
               httpContext.wbHandled = (byte)(1) ;
            }
         }
      }
   }

   public void afterTrn( )
   {
      if ( trnEnded == 1 )
      {
         if ( ! (GXutil.strcmp("", endTrnMsgTxt)==0) )
         {
            httpContext.GX_msglist.addItem(endTrnMsgTxt, endTrnMsgCod, 0, "", true);
         }
         trnEnded = 0 ;
         standaloneNotModal( ) ;
         standaloneModal( ) ;
         if ( isIns( )  )
         {
            /* Clear variables for new insertion. */
            initAll2O130( ) ;
            standaloneNotModal( ) ;
            standaloneModal( ) ;
         }
      }
      endTrnMsgTxt = "" ;
   }

   public String toString( )
   {
      return "" ;
   }

   public GXContentInfo getContentInfo( )
   {
      return (GXContentInfo)(null) ;
   }

   public void disable_std_buttons( )
   {
      if ( isIns( ) )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
   }

   public void disable_std_buttons_dsp( )
   {
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      bttBtn_first_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_first_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_first_Visible), 5, 0), true);
      bttBtn_previous_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_previous_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_previous_Visible), 5, 0), true);
      bttBtn_next_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_next_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_next_Visible), 5, 0), true);
      bttBtn_last_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_last_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_last_Visible), 5, 0), true);
      bttBtn_select_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_select_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_select_Visible), 5, 0), true);
      bttBtn_delete_Visible = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Visible), 5, 0), true);
      if ( isDsp( ) )
      {
         bttBtn_enter_Visible = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Visible", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Visible), 5, 0), true);
      }
      disableAttributes2O130( ) ;
   }

   public void set_caption( )
   {
      if ( ( IsConfirmed == 1 ) && ( AnyError == 0 ) )
      {
         if ( isDlt( ) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_confdelete"), 0, "", true);
         }
         else
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_mustconfirm"), 0, "", true);
         }
      }
   }

   public void resetCaption2O0( )
   {
   }

   public void zm2O130( int GX_JID )
   {
      if ( ( GX_JID == 1 ) || ( GX_JID == 0 ) )
      {
         if ( ! isIns( ) )
         {
            Z1217TokenPais = T002O3_A1217TokenPais[0] ;
            Z1218TokenFecha = T002O3_A1218TokenFecha[0] ;
            Z1220TokenTipo = T002O3_A1220TokenTipo[0] ;
            Z1225TokenEnv = T002O3_A1225TokenEnv[0] ;
         }
         else
         {
            Z1217TokenPais = A1217TokenPais ;
            Z1218TokenFecha = A1218TokenFecha ;
            Z1220TokenTipo = A1220TokenTipo ;
            Z1225TokenEnv = A1225TokenEnv ;
         }
      }
      if ( GX_JID == -1 )
      {
         Z1216TokenId = A1216TokenId ;
         Z1217TokenPais = A1217TokenPais ;
         Z1218TokenFecha = A1218TokenFecha ;
         Z1220TokenTipo = A1220TokenTipo ;
         Z1219TokenRecibido = A1219TokenRecibido ;
         Z1225TokenEnv = A1225TokenEnv ;
      }
   }

   public void standaloneNotModal( )
   {
   }

   public void standaloneModal( )
   {
      if ( GXutil.strcmp(Gx_mode, "INS") == 0 )
      {
         bttBtn_delete_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_delete_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      }
      if ( GXutil.strcmp(Gx_mode, "DSP") == 0 )
      {
         bttBtn_enter_Enabled = 0 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
      else
      {
         bttBtn_enter_Enabled = 1 ;
         httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      }
   }

   public void load2O130( )
   {
      /* Using cursor T002O4 */
      pr_localmysql.execute(2, new Object[] {Long.valueOf(A1216TokenId)});
      if ( (pr_localmysql.getStatus(2) != 101) )
      {
         RcdFound130 = (short)(1) ;
         A1217TokenPais = T002O4_A1217TokenPais[0] ;
         n1217TokenPais = T002O4_n1217TokenPais[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1217TokenPais", A1217TokenPais);
         A1218TokenFecha = T002O4_A1218TokenFecha[0] ;
         n1218TokenFecha = T002O4_n1218TokenFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1218TokenFecha", A1218TokenFecha);
         A1220TokenTipo = T002O4_A1220TokenTipo[0] ;
         n1220TokenTipo = T002O4_n1220TokenTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1220TokenTipo", A1220TokenTipo);
         A1219TokenRecibido = T002O4_A1219TokenRecibido[0] ;
         n1219TokenRecibido = T002O4_n1219TokenRecibido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1219TokenRecibido", A1219TokenRecibido);
         A1225TokenEnv = T002O4_A1225TokenEnv[0] ;
         n1225TokenEnv = T002O4_n1225TokenEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1225TokenEnv", A1225TokenEnv);
         zm2O130( -1) ;
      }
      pr_localmysql.close(2);
      onLoadActions2O130( ) ;
   }

   public void onLoadActions2O130( )
   {
   }

   public void checkExtendedTable2O130( )
   {
      nIsDirty_130 = (short)(0) ;
      Gx_BScreen = (byte)(1) ;
      standaloneModal( ) ;
   }

   public void closeExtendedTableCursors2O130( )
   {
   }

   public void enableDisable( )
   {
   }

   public void getKey2O130( )
   {
      /* Using cursor T002O5 */
      pr_localmysql.execute(3, new Object[] {Long.valueOf(A1216TokenId)});
      if ( (pr_localmysql.getStatus(3) != 101) )
      {
         RcdFound130 = (short)(1) ;
      }
      else
      {
         RcdFound130 = (short)(0) ;
      }
      pr_localmysql.close(3);
   }

   public void getByPrimaryKey( )
   {
      /* Using cursor T002O3 */
      pr_localmysql.execute(1, new Object[] {Long.valueOf(A1216TokenId)});
      if ( (pr_localmysql.getStatus(1) != 101) )
      {
         zm2O130( 1) ;
         RcdFound130 = (short)(1) ;
         A1216TokenId = T002O3_A1216TokenId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1216TokenId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1216TokenId), 10, 0));
         A1217TokenPais = T002O3_A1217TokenPais[0] ;
         n1217TokenPais = T002O3_n1217TokenPais[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1217TokenPais", A1217TokenPais);
         A1218TokenFecha = T002O3_A1218TokenFecha[0] ;
         n1218TokenFecha = T002O3_n1218TokenFecha[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1218TokenFecha", A1218TokenFecha);
         A1220TokenTipo = T002O3_A1220TokenTipo[0] ;
         n1220TokenTipo = T002O3_n1220TokenTipo[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1220TokenTipo", A1220TokenTipo);
         A1219TokenRecibido = T002O3_A1219TokenRecibido[0] ;
         n1219TokenRecibido = T002O3_n1219TokenRecibido[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1219TokenRecibido", A1219TokenRecibido);
         A1225TokenEnv = T002O3_A1225TokenEnv[0] ;
         n1225TokenEnv = T002O3_n1225TokenEnv[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1225TokenEnv", A1225TokenEnv);
         Z1216TokenId = A1216TokenId ;
         sMode130 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         load2O130( ) ;
         if ( AnyError == 1 )
         {
            RcdFound130 = (short)(0) ;
            initializeNonKey2O130( ) ;
         }
         Gx_mode = sMode130 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         RcdFound130 = (short)(0) ;
         initializeNonKey2O130( ) ;
         sMode130 = Gx_mode ;
         Gx_mode = "DSP" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
         standaloneModal( ) ;
         Gx_mode = sMode130 ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      pr_localmysql.close(1);
   }

   public void getEqualNoModal( )
   {
      getKey2O130( ) ;
      if ( RcdFound130 == 0 )
      {
         Gx_mode = "INS" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      getByPrimaryKey( ) ;
   }

   public void move_next( )
   {
      RcdFound130 = (short)(0) ;
      /* Using cursor T002O6 */
      pr_localmysql.execute(4, new Object[] {Long.valueOf(A1216TokenId)});
      if ( (pr_localmysql.getStatus(4) != 101) )
      {
         while ( (pr_localmysql.getStatus(4) != 101) && ( ( T002O6_A1216TokenId[0] < A1216TokenId ) ) )
         {
            pr_localmysql.readNext(4);
         }
         if ( (pr_localmysql.getStatus(4) != 101) && ( ( T002O6_A1216TokenId[0] > A1216TokenId ) ) )
         {
            A1216TokenId = T002O6_A1216TokenId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1216TokenId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1216TokenId), 10, 0));
            RcdFound130 = (short)(1) ;
         }
      }
      pr_localmysql.close(4);
   }

   public void move_previous( )
   {
      RcdFound130 = (short)(0) ;
      /* Using cursor T002O7 */
      pr_localmysql.execute(5, new Object[] {Long.valueOf(A1216TokenId)});
      if ( (pr_localmysql.getStatus(5) != 101) )
      {
         while ( (pr_localmysql.getStatus(5) != 101) && ( ( T002O7_A1216TokenId[0] > A1216TokenId ) ) )
         {
            pr_localmysql.readNext(5);
         }
         if ( (pr_localmysql.getStatus(5) != 101) && ( ( T002O7_A1216TokenId[0] < A1216TokenId ) ) )
         {
            A1216TokenId = T002O7_A1216TokenId[0] ;
            httpContext.ajax_rsp_assign_attri("", false, "A1216TokenId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1216TokenId), 10, 0));
            RcdFound130 = (short)(1) ;
         }
      }
      pr_localmysql.close(5);
   }

   public void btn_enter( )
   {
      nKeyPressed = (byte)(1) ;
      getKey2O130( ) ;
      if ( isIns( ) )
      {
         /* Insert record */
         GX_FocusControl = edtTokenId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         insert2O130( ) ;
         if ( AnyError == 1 )
         {
            GX_FocusControl = "" ;
            httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
         }
      }
      else
      {
         if ( RcdFound130 == 1 )
         {
            if ( A1216TokenId != Z1216TokenId )
            {
               A1216TokenId = Z1216TokenId ;
               httpContext.ajax_rsp_assign_attri("", false, "A1216TokenId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1216TokenId), 10, 0));
               httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforeupd"), "CandidateKeyNotFound", 1, "TOKENID");
               AnyError = (short)(1) ;
               GX_FocusControl = edtTokenId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else if ( isDlt( ) )
            {
               delete( ) ;
               afterTrn( ) ;
               GX_FocusControl = edtTokenId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
            else
            {
               Gx_mode = "UPD" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Update record */
               update2O130( ) ;
               GX_FocusControl = edtTokenId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
            }
         }
         else
         {
            if ( A1216TokenId != Z1216TokenId )
            {
               Gx_mode = "INS" ;
               httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
               /* Insert record */
               GX_FocusControl = edtTokenId_Internalname ;
               httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               insert2O130( ) ;
               if ( AnyError == 1 )
               {
                  GX_FocusControl = "" ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
            }
            else
            {
               if ( GXutil.strcmp(Gx_mode, "UPD") == 0 )
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_recdeleted"), 1, "TOKENID");
                  AnyError = (short)(1) ;
                  GX_FocusControl = edtTokenId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
               }
               else
               {
                  Gx_mode = "INS" ;
                  httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                  /* Insert record */
                  GX_FocusControl = edtTokenId_Internalname ;
                  httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  insert2O130( ) ;
                  if ( AnyError == 1 )
                  {
                     GX_FocusControl = "" ;
                     httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
                  }
               }
            }
         }
      }
      afterTrn( ) ;
   }

   public void btn_delete( )
   {
      if ( A1216TokenId != Z1216TokenId )
      {
         A1216TokenId = Z1216TokenId ;
         httpContext.ajax_rsp_assign_attri("", false, "A1216TokenId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1216TokenId), 10, 0));
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_getbeforedlt"), 1, "TOKENID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTokenId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      else
      {
         delete( ) ;
         afterTrn( ) ;
         GX_FocusControl = edtTokenId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      if ( AnyError != 0 )
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      else
      {
         getByPrimaryKey( ) ;
      }
      CloseOpenCursors();
   }

   public void btn_get( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      if ( RcdFound130 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_keynfound"), "PrimaryKeyNotFound", 1, "TOKENID");
         AnyError = (short)(1) ;
         GX_FocusControl = edtTokenId_Internalname ;
         httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      }
      GX_FocusControl = edtTokenPais_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_first( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart2O130( ) ;
      if ( RcdFound130 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTokenPais_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd2O130( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_previous( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_previous( ) ;
      if ( RcdFound130 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTokenPais_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_next( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      move_next( ) ;
      if ( RcdFound130 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTokenPais_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_last( )
   {
      nKeyPressed = (byte)(2) ;
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      scanStart2O130( ) ;
      if ( RcdFound130 == 0 )
      {
         httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_norectobrow"), 0, "", true);
      }
      else
      {
         while ( RcdFound130 != 0 )
         {
            scanNext2O130( ) ;
         }
         Gx_mode = "UPD" ;
         httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      }
      GX_FocusControl = edtTokenPais_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      scanEnd2O130( ) ;
      getByPrimaryKey( ) ;
      standaloneNotModal( ) ;
      standaloneModal( ) ;
   }

   public void btn_select( )
   {
      getEqualNoModal( ) ;
   }

   public void checkOptimisticConcurrency2O130( )
   {
      if ( ! isIns( ) )
      {
         /* Using cursor T002O2 */
         pr_localmysql.execute(0, new Object[] {Long.valueOf(A1216TokenId)});
         if ( (pr_localmysql.getStatus(0) == 103) )
         {
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TOKEN"}), "RecordIsLocked", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
         if ( (pr_localmysql.getStatus(0) == 101) || ( GXutil.strcmp(Z1217TokenPais, T002O2_A1217TokenPais[0]) != 0 ) || ( GXutil.strcmp(Z1218TokenFecha, T002O2_A1218TokenFecha[0]) != 0 ) || ( GXutil.strcmp(Z1220TokenTipo, T002O2_A1220TokenTipo[0]) != 0 ) || ( GXutil.strcmp(Z1225TokenEnv, T002O2_A1225TokenEnv[0]) != 0 ) )
         {
            if ( GXutil.strcmp(Z1217TokenPais, T002O2_A1217TokenPais[0]) != 0 )
            {
               GXutil.writeLogln("servicioscomunes.token:[seudo value changed for attri]"+"TokenPais");
               GXutil.writeLogRaw("Old: ",Z1217TokenPais);
               GXutil.writeLogRaw("Current: ",T002O2_A1217TokenPais[0]);
            }
            if ( GXutil.strcmp(Z1218TokenFecha, T002O2_A1218TokenFecha[0]) != 0 )
            {
               GXutil.writeLogln("servicioscomunes.token:[seudo value changed for attri]"+"TokenFecha");
               GXutil.writeLogRaw("Old: ",Z1218TokenFecha);
               GXutil.writeLogRaw("Current: ",T002O2_A1218TokenFecha[0]);
            }
            if ( GXutil.strcmp(Z1220TokenTipo, T002O2_A1220TokenTipo[0]) != 0 )
            {
               GXutil.writeLogln("servicioscomunes.token:[seudo value changed for attri]"+"TokenTipo");
               GXutil.writeLogRaw("Old: ",Z1220TokenTipo);
               GXutil.writeLogRaw("Current: ",T002O2_A1220TokenTipo[0]);
            }
            if ( GXutil.strcmp(Z1225TokenEnv, T002O2_A1225TokenEnv[0]) != 0 )
            {
               GXutil.writeLogln("servicioscomunes.token:[seudo value changed for attri]"+"TokenEnv");
               GXutil.writeLogRaw("Old: ",Z1225TokenEnv);
               GXutil.writeLogRaw("Current: ",T002O2_A1225TokenEnv[0]);
            }
            httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_waschg", new Object[] {"TOKEN"}), "RecordWasChanged", 1, "");
            AnyError = (short)(1) ;
            return  ;
         }
      }
   }

   public void insert2O130( )
   {
      beforeValidate2O130( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2O130( ) ;
      }
      if ( AnyError == 0 )
      {
         zm2O130( 0) ;
         checkOptimisticConcurrency2O130( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2O130( ) ;
            if ( AnyError == 0 )
            {
               beforeInsert2O130( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002O8 */
                  pr_localmysql.execute(6, new Object[] {Long.valueOf(A1216TokenId), Boolean.valueOf(n1217TokenPais), A1217TokenPais, Boolean.valueOf(n1218TokenFecha), A1218TokenFecha, Boolean.valueOf(n1220TokenTipo), A1220TokenTipo, Boolean.valueOf(n1219TokenRecibido), A1219TokenRecibido, Boolean.valueOf(n1225TokenEnv), A1225TokenEnv});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("token");
                  if ( (pr_localmysql.getStatus(6) == 1) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_noupdate"), "DuplicatePrimaryKey", 1, "");
                     AnyError = (short)(1) ;
                  }
                  if ( AnyError == 0 )
                  {
                     /* Start of After( Insert) rules */
                     /* End of After( Insert) rules */
                     if ( AnyError == 0 )
                     {
                        /* Save values for previous() function. */
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucadded") ;
                        endTrnMsgCod = "SuccessfullyAdded" ;
                        resetCaption2O0( ) ;
                     }
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
         else
         {
            load2O130( ) ;
         }
         endLevel2O130( ) ;
      }
      closeExtendedTableCursors2O130( ) ;
   }

   public void update2O130( )
   {
      beforeValidate2O130( ) ;
      if ( AnyError == 0 )
      {
         checkExtendedTable2O130( ) ;
      }
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2O130( ) ;
         if ( AnyError == 0 )
         {
            afterConfirm2O130( ) ;
            if ( AnyError == 0 )
            {
               beforeUpdate2O130( ) ;
               if ( AnyError == 0 )
               {
                  /* Using cursor T002O9 */
                  pr_localmysql.execute(7, new Object[] {Boolean.valueOf(n1217TokenPais), A1217TokenPais, Boolean.valueOf(n1218TokenFecha), A1218TokenFecha, Boolean.valueOf(n1220TokenTipo), A1220TokenTipo, Boolean.valueOf(n1219TokenRecibido), A1219TokenRecibido, Boolean.valueOf(n1225TokenEnv), A1225TokenEnv, Long.valueOf(A1216TokenId)});
                  Application.getSmartCacheProvider(remoteHandle).setUpdated("token");
                  if ( (pr_localmysql.getStatus(7) == 103) )
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_lock", new Object[] {"TOKEN"}), "RecordIsLocked", 1, "");
                     AnyError = (short)(1) ;
                  }
                  deferredUpdate2O130( ) ;
                  if ( AnyError == 0 )
                  {
                     /* Start of After( update) rules */
                     /* End of After( update) rules */
                     if ( AnyError == 0 )
                     {
                        getByPrimaryKey( ) ;
                        endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucupdated") ;
                        endTrnMsgCod = "SuccessfullyUpdated" ;
                        resetCaption2O0( ) ;
                     }
                  }
                  else
                  {
                     httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                     AnyError = (short)(1) ;
                  }
               }
            }
         }
         endLevel2O130( ) ;
      }
      closeExtendedTableCursors2O130( ) ;
   }

   public void deferredUpdate2O130( )
   {
   }

   public void delete( )
   {
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      beforeValidate2O130( ) ;
      if ( AnyError == 0 )
      {
         checkOptimisticConcurrency2O130( ) ;
      }
      if ( AnyError == 0 )
      {
         onDeleteControls2O130( ) ;
         afterConfirm2O130( ) ;
         if ( AnyError == 0 )
         {
            beforeDelete2O130( ) ;
            if ( AnyError == 0 )
            {
               /* No cascading delete specified. */
               /* Using cursor T002O10 */
               pr_localmysql.execute(8, new Object[] {Long.valueOf(A1216TokenId)});
               Application.getSmartCacheProvider(remoteHandle).setUpdated("token");
               if ( AnyError == 0 )
               {
                  /* Start of After( delete) rules */
                  /* End of After( delete) rules */
                  if ( AnyError == 0 )
                  {
                     move_next( ) ;
                     if ( RcdFound130 == 0 )
                     {
                        initAll2O130( ) ;
                        Gx_mode = "INS" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     else
                     {
                        getByPrimaryKey( ) ;
                        Gx_mode = "UPD" ;
                        httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
                     }
                     endTrnMsgTxt = localUtil.getMessages().getMessage("GXM_sucdeleted") ;
                     endTrnMsgCod = "SuccessfullyDeleted" ;
                     resetCaption2O0( ) ;
                  }
               }
               else
               {
                  httpContext.GX_msglist.addItem(localUtil.getMessages().getMessage("GXM_unexp"), 1, "");
                  AnyError = (short)(1) ;
               }
            }
         }
      }
      sMode130 = Gx_mode ;
      Gx_mode = "DLT" ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
      endLevel2O130( ) ;
      Gx_mode = sMode130 ;
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", Gx_mode);
   }

   public void onDeleteControls2O130( )
   {
      standaloneModal( ) ;
      /* No delete mode formulas found. */
   }

   public void endLevel2O130( )
   {
      if ( ! isIns( ) )
      {
         pr_localmysql.close(0);
      }
      if ( AnyError == 0 )
      {
         beforeComplete2O130( ) ;
      }
      if ( AnyError == 0 )
      {
         Application.commitDataStores(context, remoteHandle, pr_default, "servicioscomunes.token");
         if ( AnyError == 0 )
         {
            confirmValues2O0( ) ;
         }
         /* After transaction rules */
         /* Execute 'After Trn' event if defined. */
         trnEnded = 1 ;
      }
      else
      {
         Application.rollbackDataStores(context, remoteHandle, pr_default, "servicioscomunes.token");
      }
      IsModified = (short)(0) ;
      if ( AnyError != 0 )
      {
         httpContext.wjLoc = "" ;
         httpContext.nUserReturn = (byte)(0) ;
      }
   }

   public void scanStart2O130( )
   {
      /* Using cursor T002O11 */
      pr_localmysql.execute(9);
      RcdFound130 = (short)(0) ;
      if ( (pr_localmysql.getStatus(9) != 101) )
      {
         RcdFound130 = (short)(1) ;
         A1216TokenId = T002O11_A1216TokenId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1216TokenId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1216TokenId), 10, 0));
      }
      /* Load Subordinate Levels */
   }

   public void scanNext2O130( )
   {
      /* Scan next routine */
      pr_localmysql.readNext(9);
      RcdFound130 = (short)(0) ;
      if ( (pr_localmysql.getStatus(9) != 101) )
      {
         RcdFound130 = (short)(1) ;
         A1216TokenId = T002O11_A1216TokenId[0] ;
         httpContext.ajax_rsp_assign_attri("", false, "A1216TokenId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1216TokenId), 10, 0));
      }
   }

   public void scanEnd2O130( )
   {
      pr_localmysql.close(9);
   }

   public void afterConfirm2O130( )
   {
      /* After Confirm Rules */
   }

   public void beforeInsert2O130( )
   {
      /* Before Insert Rules */
   }

   public void beforeUpdate2O130( )
   {
      /* Before Update Rules */
   }

   public void beforeDelete2O130( )
   {
      /* Before Delete Rules */
   }

   public void beforeComplete2O130( )
   {
      /* Before Complete Rules */
   }

   public void beforeValidate2O130( )
   {
      /* Before Validate Rules */
   }

   public void disableAttributes2O130( )
   {
      edtTokenId_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTokenId_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTokenId_Enabled), 5, 0), true);
      edtTokenPais_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTokenPais_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTokenPais_Enabled), 5, 0), true);
      edtTokenFecha_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTokenFecha_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTokenFecha_Enabled), 5, 0), true);
      edtTokenTipo_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTokenTipo_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTokenTipo_Enabled), 5, 0), true);
      edtTokenRecibido_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTokenRecibido_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTokenRecibido_Enabled), 5, 0), true);
      edtTokenEnv_Enabled = 0 ;
      httpContext.ajax_rsp_assign_prop("", false, edtTokenEnv_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(edtTokenEnv_Enabled), 5, 0), true);
   }

   public void send_integrity_lvl_hashes2O130( )
   {
   }

   public void assign_properties_default( )
   {
   }

   public void confirmValues2O0( )
   {
   }

   public void renderHtmlHeaders( )
   {
      com.b2brestv1.GxWebStd.gx_html_headers( httpContext, 0, "", "", Form.getMeta(), Form.getMetaequiv(), true);
   }

   public void renderHtmlOpenForm( )
   {
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( "<title>") ;
      httpContext.writeValue( Form.getCaption()) ;
      httpContext.writeTextNL( "</title>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      if ( GXutil.len( sDynURL) > 0 )
      {
         httpContext.writeText( "<BASE href=\""+sDynURL+"\" />") ;
      }
      define_styles( ) ;
      MasterPageObj.master_styles();
      if ( ( ( httpContext.getBrowserType( ) == 1 ) || ( httpContext.getBrowserType( ) == 5 ) ) && ( GXutil.strcmp(httpContext.getBrowserVersion( ), "7.0") == 0 ) )
      {
         httpContext.AddJavascriptSource("json2.js", "?"+httpContext.getBuildNumber( 147395), false, true);
      }
      httpContext.AddJavascriptSource("jquery.js", "?"+httpContext.getBuildNumber( 147395), false, true);
      httpContext.AddJavascriptSource("gxgral.js", "?"+httpContext.getBuildNumber( 147395), false, true);
      httpContext.AddJavascriptSource("gxcfg.js", "?202183018134689", false, true);
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      httpContext.writeText( Form.getHeaderrawhtml()) ;
      httpContext.closeHtmlHeader();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      FormProcess = " data-HasEnter=\"true\" data-Skiponenter=\"false\"" ;
      httpContext.writeText( "<body ") ;
      bodyStyle = "" + "background-color:" + WebUtils.getHTMLColor( Form.getIBackground()) + ";color:" + WebUtils.getHTMLColor( Form.getTextcolor()) + ";" ;
      bodyStyle += "-moz-opacity:0;opacity:0;" ;
      if ( ! ( (GXutil.strcmp("", Form.getBackground())==0) ) )
      {
         bodyStyle += " background-image:url(" + httpContext.convertURL( Form.getBackground()) + ")" ;
      }
      httpContext.writeText( " "+"class=\"form-horizontal Form\""+" "+ "style='"+bodyStyle+"'") ;
      httpContext.writeText( FormProcess+">") ;
      httpContext.skipLines( 1 );
      httpContext.writeTextNL( "<form id=\"MAINFORM\" autocomplete=\"off\" name=\"MAINFORM\" method=\"post\" tabindex=-1  class=\"form-horizontal Form\" data-gx-class=\"form-horizontal Form\" novalidate action=\""+formatLink("com.b2brestv1.servicioscomunes.token", new String[] {}, new String[] {}) +"\">") ;
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "_EventName", "");
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "_EventGridId", "");
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "_EventRowId", "");
      httpContext.writeText( "<input type=\"submit\" title=\"submit\" style=\"display:none\" disabled>") ;
      httpContext.ajax_rsp_assign_prop("", false, "FORM", "Class", "form-horizontal Form", true);
      toggleJsOutput = httpContext.isJsOutputEnabled( ) ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
   }

   public void send_integrity_footer_hashes( )
   {
      GXKey = httpContext.decrypt64( httpContext.getCookie( "GX_SESSION_ID"), context.getServerKey( )) ;
   }

   public void sendCloseFormHiddens( )
   {
      /* Send hidden variables. */
      /* Send saved values. */
      send_integrity_footer_hashes( ) ;
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Z1216TokenId", GXutil.ltrim( localUtil.ntoc( Z1216TokenId, (byte)(10), (byte)(0), ".", "")));
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Z1217TokenPais", GXutil.rtrim( Z1217TokenPais));
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Z1218TokenFecha", GXutil.rtrim( Z1218TokenFecha));
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Z1220TokenTipo", Z1220TokenTipo);
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Z1225TokenEnv", GXutil.rtrim( Z1225TokenEnv));
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "IsConfirmed", GXutil.ltrim( localUtil.ntoc( IsConfirmed, (byte)(4), (byte)(0), ".", "")));
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "IsModified", GXutil.ltrim( localUtil.ntoc( IsModified, (byte)(4), (byte)(0), ".", "")));
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Mode", GXutil.rtrim( Gx_mode));
   }

   public void renderHtmlCloseForm( )
   {
      sendCloseFormHiddens( ) ;
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "GX_FocusControl", GX_FocusControl);
      httpContext.SendAjaxEncryptionKey();
      sendSecurityToken(sPrefix);
      httpContext.SendComponentObjects();
      httpContext.SendServerCommands();
      httpContext.SendState();
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableOutput();
      }
      httpContext.writeTextNL( "</form>") ;
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      include_jscripts( ) ;
   }

   public byte executeStartEvent( )
   {
      standaloneStartup( ) ;
      gxajaxcallmode = (byte)((isAjaxCallMode( ) ? 1 : 0)) ;
      return gxajaxcallmode ;
   }

   public void renderHtmlContent( )
   {
      httpContext.writeText( "<div") ;
      com.b2brestv1.GxWebStd.classAttribute( httpContext, "gx-ct-body"+" "+((GXutil.strcmp("", Form.getThemeClass())==0) ? "form-horizontal Form" : Form.getThemeClass())+"-fx");
      httpContext.writeText( ">") ;
      draw( ) ;
      httpContext.writeText( "</div>") ;
   }

   public void dispatchEvents( )
   {
      process( ) ;
   }

   public boolean hasEnterEvent( )
   {
      return true ;
   }

   public com.genexus.webpanels.GXWebForm getForm( )
   {
      return Form ;
   }

   public String getSelfLink( )
   {
      return formatLink("com.b2brestv1.servicioscomunes.token", new String[] {}, new String[] {})  ;
   }

   public String getPgmname( )
   {
      return "ServiciosComunes.Token" ;
   }

   public String getPgmdesc( )
   {
      return "Token" ;
   }

   public void initializeNonKey2O130( )
   {
      A1217TokenPais = "" ;
      n1217TokenPais = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1217TokenPais", A1217TokenPais);
      n1217TokenPais = ((GXutil.strcmp("", A1217TokenPais)==0) ? true : false) ;
      A1218TokenFecha = "" ;
      n1218TokenFecha = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1218TokenFecha", A1218TokenFecha);
      n1218TokenFecha = ((GXutil.strcmp("", A1218TokenFecha)==0) ? true : false) ;
      A1220TokenTipo = "" ;
      n1220TokenTipo = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1220TokenTipo", A1220TokenTipo);
      n1220TokenTipo = ((GXutil.strcmp("", A1220TokenTipo)==0) ? true : false) ;
      A1219TokenRecibido = "" ;
      n1219TokenRecibido = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1219TokenRecibido", A1219TokenRecibido);
      n1219TokenRecibido = ((GXutil.strcmp("", A1219TokenRecibido)==0) ? true : false) ;
      A1225TokenEnv = "" ;
      n1225TokenEnv = false ;
      httpContext.ajax_rsp_assign_attri("", false, "A1225TokenEnv", A1225TokenEnv);
      n1225TokenEnv = ((GXutil.strcmp("", A1225TokenEnv)==0) ? true : false) ;
      Z1217TokenPais = "" ;
      Z1218TokenFecha = "" ;
      Z1220TokenTipo = "" ;
      Z1225TokenEnv = "" ;
   }

   public void initAll2O130( )
   {
      A1216TokenId = 0 ;
      httpContext.ajax_rsp_assign_attri("", false, "A1216TokenId", GXutil.ltrimstr( DecimalUtil.doubleToDec(A1216TokenId), 10, 0));
      initializeNonKey2O130( ) ;
   }

   public void standaloneModalInsert( )
   {
   }

   public void define_styles( )
   {
      httpContext.AddThemeStyleSheetFile("", context.getHttpContext().getTheme( )+".css", "?"+httpContext.getCacheInvalidationToken( ));
      boolean outputEnabled = httpContext.isOutputEnabled( );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableOutput();
      }
      idxLst = 1 ;
      while ( idxLst <= Form.getJscriptsrc().getCount() )
      {
         httpContext.AddJavascriptSource(GXutil.rtrim( Form.getJscriptsrc().item(idxLst)), "?202183018134697", true, true);
         idxLst = (int)(idxLst+1) ;
      }
      if ( ! outputEnabled )
      {
         if ( httpContext.isSpaRequest( ) )
         {
            httpContext.disableOutput();
         }
      }
      /* End function define_styles */
   }

   public void include_jscripts( )
   {
      httpContext.AddJavascriptSource("messages.eng.js", "?"+httpContext.getCacheInvalidationToken( ), false, true);
      httpContext.AddJavascriptSource("servicioscomunes/token.js", "?202183018134697", false, true);
      /* End function include_jscripts */
   }

   public void init_default_properties( )
   {
      lblTitle_Internalname = "TITLE" ;
      divTitlecontainer_Internalname = "TITLECONTAINER" ;
      bttBtn_first_Internalname = "BTN_FIRST" ;
      bttBtn_previous_Internalname = "BTN_PREVIOUS" ;
      bttBtn_next_Internalname = "BTN_NEXT" ;
      bttBtn_last_Internalname = "BTN_LAST" ;
      bttBtn_select_Internalname = "BTN_SELECT" ;
      divToolbarcell_Internalname = "TOOLBARCELL" ;
      edtTokenId_Internalname = "TOKENID" ;
      edtTokenPais_Internalname = "TOKENPAIS" ;
      edtTokenFecha_Internalname = "TOKENFECHA" ;
      edtTokenTipo_Internalname = "TOKENTIPO" ;
      edtTokenRecibido_Internalname = "TOKENRECIBIDO" ;
      edtTokenEnv_Internalname = "TOKENENV" ;
      divFormcontainer_Internalname = "FORMCONTAINER" ;
      bttBtn_enter_Internalname = "BTN_ENTER" ;
      bttBtn_cancel_Internalname = "BTN_CANCEL" ;
      bttBtn_delete_Internalname = "BTN_DELETE" ;
      divMaintable_Internalname = "MAINTABLE" ;
      Form.setInternalname( "FORM" );
   }

   public void initialize_properties( )
   {
      httpContext.setAjaxOnSessionTimeout(ajaxOnSessionTimeout());
      httpContext.setDefaultTheme("Carmine");
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.disableJsOutput();
      }
      init_default_properties( ) ;
      Form.setHeaderrawhtml( "" );
      Form.setBackground( "" );
      Form.setTextcolor( 0 );
      Form.setIBackground( (int)(0xFFFFFF) );
      Form.setCaption( "Token" );
      bttBtn_delete_Enabled = 1 ;
      bttBtn_delete_Visible = 1 ;
      bttBtn_cancel_Visible = 1 ;
      bttBtn_enter_Enabled = 1 ;
      bttBtn_enter_Visible = 1 ;
      edtTokenEnv_Jsonclick = "" ;
      edtTokenEnv_Enabled = 1 ;
      edtTokenRecibido_Enabled = 1 ;
      edtTokenTipo_Jsonclick = "" ;
      edtTokenTipo_Enabled = 1 ;
      edtTokenFecha_Jsonclick = "" ;
      edtTokenFecha_Enabled = 1 ;
      edtTokenPais_Jsonclick = "" ;
      edtTokenPais_Enabled = 1 ;
      edtTokenId_Jsonclick = "" ;
      edtTokenId_Enabled = 1 ;
      bttBtn_select_Visible = 1 ;
      bttBtn_last_Visible = 1 ;
      bttBtn_next_Visible = 1 ;
      bttBtn_previous_Visible = 1 ;
      bttBtn_first_Visible = 1 ;
      httpContext.GX_msglist.setDisplaymode( (short)(1) );
      if ( httpContext.isSpaRequest( ) )
      {
         httpContext.enableJsOutput();
      }
   }

   public void dynload_actions( )
   {
      /* End function dynload_actions */
   }

   public void init_web_controls( )
   {
      /* End function init_web_controls */
   }

   public void afterkeyloadscreen( )
   {
      IsConfirmed = (short)(0) ;
      httpContext.ajax_rsp_assign_attri("", false, "IsConfirmed", GXutil.ltrimstr( DecimalUtil.doubleToDec(IsConfirmed), 4, 0));
      getEqualNoModal( ) ;
      GX_FocusControl = edtTokenPais_Internalname ;
      httpContext.ajax_rsp_assign_attri("", false, "GX_FocusControl", GX_FocusControl);
      standaloneNotModal( ) ;
      standaloneModal( ) ;
      /* End function AfterKeyLoadScreen */
   }

   public boolean isIns( )
   {
      return ((GXutil.strcmp(Gx_mode, "INS")==0) ? true : false) ;
   }

   public boolean isDlt( )
   {
      return ((GXutil.strcmp(Gx_mode, "DLT")==0) ? true : false) ;
   }

   public boolean isUpd( )
   {
      return ((GXutil.strcmp(Gx_mode, "UPD")==0) ? true : false) ;
   }

   public boolean isDsp( )
   {
      return ((GXutil.strcmp(Gx_mode, "DSP")==0) ? true : false) ;
   }

   public void valid_Tokenid( )
   {
      httpContext.wbHandled = (byte)(1) ;
      afterkeyloadscreen( ) ;
      draw( ) ;
      send_integrity_footer_hashes( ) ;
      dynload_actions( ) ;
      /*  Sending validation outputs */
      httpContext.ajax_rsp_assign_attri("", false, "A1217TokenPais", GXutil.rtrim( A1217TokenPais));
      httpContext.ajax_rsp_assign_attri("", false, "A1218TokenFecha", GXutil.rtrim( A1218TokenFecha));
      httpContext.ajax_rsp_assign_attri("", false, "A1220TokenTipo", A1220TokenTipo);
      httpContext.ajax_rsp_assign_attri("", false, "A1219TokenRecibido", A1219TokenRecibido);
      httpContext.ajax_rsp_assign_attri("", false, "A1225TokenEnv", GXutil.rtrim( A1225TokenEnv));
      httpContext.ajax_rsp_assign_attri("", false, "Gx_mode", GXutil.rtrim( Gx_mode));
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Z1216TokenId", GXutil.ltrim( localUtil.ntoc( Z1216TokenId, (byte)(10), (byte)(0), ".", "")));
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Z1217TokenPais", GXutil.rtrim( Z1217TokenPais));
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Z1218TokenFecha", GXutil.rtrim( Z1218TokenFecha));
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Z1220TokenTipo", Z1220TokenTipo);
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Z1219TokenRecibido", Z1219TokenRecibido);
      com.b2brestv1.GxWebStd.gx_hidden_field( httpContext, "Z1225TokenEnv", GXutil.rtrim( Z1225TokenEnv));
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_delete_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_delete_Enabled), 5, 0), true);
      httpContext.ajax_rsp_assign_prop("", false, bttBtn_enter_Internalname, "Enabled", GXutil.ltrimstr( DecimalUtil.doubleToDec(bttBtn_enter_Enabled), 5, 0), true);
      sendCloseFormHiddens( ) ;
   }

   public boolean supportAjaxEvent( )
   {
      return true ;
   }

   public void initializeDynEvents( )
   {
      setEventMetadata("ENTER","{handler:'userMainFullajax',iparms:[{postForm:true}]");
      setEventMetadata("ENTER",",oparms:[]}");
      setEventMetadata("REFRESH","{handler:'refresh',iparms:[]");
      setEventMetadata("REFRESH",",oparms:[]}");
      setEventMetadata("VALID_TOKENID","{handler:'valid_Tokenid',iparms:[{av:'A1216TokenId',fld:'TOKENID',pic:'ZZZZZZZZZ9'},{av:'Gx_mode',fld:'vMODE',pic:'@!'}]");
      setEventMetadata("VALID_TOKENID",",oparms:[{av:'A1217TokenPais',fld:'TOKENPAIS',pic:''},{av:'A1218TokenFecha',fld:'TOKENFECHA',pic:''},{av:'A1220TokenTipo',fld:'TOKENTIPO',pic:''},{av:'A1219TokenRecibido',fld:'TOKENRECIBIDO',pic:''},{av:'A1225TokenEnv',fld:'TOKENENV',pic:''},{av:'Gx_mode',fld:'vMODE',pic:'@!'},{av:'Z1216TokenId'},{av:'Z1217TokenPais'},{av:'Z1218TokenFecha'},{av:'Z1220TokenTipo'},{av:'Z1219TokenRecibido'},{av:'Z1225TokenEnv'},{ctrl:'BTN_DELETE',prop:'Enabled'},{ctrl:'BTN_ENTER',prop:'Enabled'}]}");
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

   protected void cleanup( )
   {
      super.cleanup();
      CloseOpenCursors();
   }

   protected void CloseOpenCursors( )
   {
   }

   /* Aggregate/select formulas */
   public void initialize( )
   {
      sPrefix = "" ;
      Z1217TokenPais = "" ;
      Z1218TokenFecha = "" ;
      Z1220TokenTipo = "" ;
      Z1225TokenEnv = "" ;
      scmdbuf = "" ;
      gxfirstwebparm = "" ;
      gxfirstwebparm_bkp = "" ;
      GXKey = "" ;
      PreviousTooltip = "" ;
      PreviousCaption = "" ;
      Form = new com.genexus.webpanels.GXWebForm();
      GX_FocusControl = "" ;
      lblTitle_Jsonclick = "" ;
      ClassString = "" ;
      StyleString = "" ;
      TempTags = "" ;
      bttBtn_first_Jsonclick = "" ;
      bttBtn_previous_Jsonclick = "" ;
      bttBtn_next_Jsonclick = "" ;
      bttBtn_last_Jsonclick = "" ;
      bttBtn_select_Jsonclick = "" ;
      A1217TokenPais = "" ;
      A1218TokenFecha = "" ;
      A1220TokenTipo = "" ;
      A1219TokenRecibido = "" ;
      A1225TokenEnv = "" ;
      bttBtn_enter_Jsonclick = "" ;
      bttBtn_cancel_Jsonclick = "" ;
      bttBtn_delete_Jsonclick = "" ;
      Gx_mode = "" ;
      sEvt = "" ;
      EvtGridId = "" ;
      EvtRowId = "" ;
      sEvtType = "" ;
      endTrnMsgTxt = "" ;
      endTrnMsgCod = "" ;
      Z1219TokenRecibido = "" ;
      T002O4_A1216TokenId = new long[1] ;
      T002O4_A1217TokenPais = new String[] {""} ;
      T002O4_n1217TokenPais = new boolean[] {false} ;
      T002O4_A1218TokenFecha = new String[] {""} ;
      T002O4_n1218TokenFecha = new boolean[] {false} ;
      T002O4_A1220TokenTipo = new String[] {""} ;
      T002O4_n1220TokenTipo = new boolean[] {false} ;
      T002O4_A1219TokenRecibido = new String[] {""} ;
      T002O4_n1219TokenRecibido = new boolean[] {false} ;
      T002O4_A1225TokenEnv = new String[] {""} ;
      T002O4_n1225TokenEnv = new boolean[] {false} ;
      T002O5_A1216TokenId = new long[1] ;
      T002O3_A1216TokenId = new long[1] ;
      T002O3_A1217TokenPais = new String[] {""} ;
      T002O3_n1217TokenPais = new boolean[] {false} ;
      T002O3_A1218TokenFecha = new String[] {""} ;
      T002O3_n1218TokenFecha = new boolean[] {false} ;
      T002O3_A1220TokenTipo = new String[] {""} ;
      T002O3_n1220TokenTipo = new boolean[] {false} ;
      T002O3_A1219TokenRecibido = new String[] {""} ;
      T002O3_n1219TokenRecibido = new boolean[] {false} ;
      T002O3_A1225TokenEnv = new String[] {""} ;
      T002O3_n1225TokenEnv = new boolean[] {false} ;
      sMode130 = "" ;
      T002O6_A1216TokenId = new long[1] ;
      T002O7_A1216TokenId = new long[1] ;
      T002O2_A1216TokenId = new long[1] ;
      T002O2_A1217TokenPais = new String[] {""} ;
      T002O2_n1217TokenPais = new boolean[] {false} ;
      T002O2_A1218TokenFecha = new String[] {""} ;
      T002O2_n1218TokenFecha = new boolean[] {false} ;
      T002O2_A1220TokenTipo = new String[] {""} ;
      T002O2_n1220TokenTipo = new boolean[] {false} ;
      T002O2_A1219TokenRecibido = new String[] {""} ;
      T002O2_n1219TokenRecibido = new boolean[] {false} ;
      T002O2_A1225TokenEnv = new String[] {""} ;
      T002O2_n1225TokenEnv = new boolean[] {false} ;
      T002O11_A1216TokenId = new long[1] ;
      sDynURL = "" ;
      FormProcess = "" ;
      bodyStyle = "" ;
      ZZ1217TokenPais = "" ;
      ZZ1218TokenFecha = "" ;
      ZZ1220TokenTipo = "" ;
      ZZ1219TokenRecibido = "" ;
      ZZ1225TokenEnv = "" ;
      pr_localmysql = new DataStoreProvider(context, remoteHandle, new com.b2brestv1.servicioscomunes.token__localmysql(),
         new Object[] {
             new Object[] {
            T002O2_A1216TokenId, T002O2_A1217TokenPais, T002O2_n1217TokenPais, T002O2_A1218TokenFecha, T002O2_n1218TokenFecha, T002O2_A1220TokenTipo, T002O2_n1220TokenTipo, T002O2_A1219TokenRecibido, T002O2_n1219TokenRecibido, T002O2_A1225TokenEnv,
            T002O2_n1225TokenEnv
            }
            , new Object[] {
            T002O3_A1216TokenId, T002O3_A1217TokenPais, T002O3_n1217TokenPais, T002O3_A1218TokenFecha, T002O3_n1218TokenFecha, T002O3_A1220TokenTipo, T002O3_n1220TokenTipo, T002O3_A1219TokenRecibido, T002O3_n1219TokenRecibido, T002O3_A1225TokenEnv,
            T002O3_n1225TokenEnv
            }
            , new Object[] {
            T002O4_A1216TokenId, T002O4_A1217TokenPais, T002O4_n1217TokenPais, T002O4_A1218TokenFecha, T002O4_n1218TokenFecha, T002O4_A1220TokenTipo, T002O4_n1220TokenTipo, T002O4_A1219TokenRecibido, T002O4_n1219TokenRecibido, T002O4_A1225TokenEnv,
            T002O4_n1225TokenEnv
            }
            , new Object[] {
            T002O5_A1216TokenId
            }
            , new Object[] {
            T002O6_A1216TokenId
            }
            , new Object[] {
            T002O7_A1216TokenId
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            }
            , new Object[] {
            T002O11_A1216TokenId
            }
         }
      );
      pr_default = new DataStoreProvider(context, remoteHandle, new com.b2brestv1.servicioscomunes.token__default(),
         new Object[] {
         }
      );
   }

   private byte GxWebError ;
   private byte nKeyPressed ;
   private byte Gx_BScreen ;
   private byte gxajaxcallmode ;
   private short gxcookieaux ;
   private short IsConfirmed ;
   private short IsModified ;
   private short AnyError ;
   private short RcdFound130 ;
   private short nIsDirty_130 ;
   private int trnEnded ;
   private int bttBtn_first_Visible ;
   private int bttBtn_previous_Visible ;
   private int bttBtn_next_Visible ;
   private int bttBtn_last_Visible ;
   private int bttBtn_select_Visible ;
   private int edtTokenId_Enabled ;
   private int edtTokenPais_Enabled ;
   private int edtTokenFecha_Enabled ;
   private int edtTokenTipo_Enabled ;
   private int edtTokenRecibido_Enabled ;
   private int edtTokenEnv_Enabled ;
   private int bttBtn_enter_Visible ;
   private int bttBtn_enter_Enabled ;
   private int bttBtn_cancel_Visible ;
   private int bttBtn_delete_Visible ;
   private int bttBtn_delete_Enabled ;
   private int GX_JID ;
   private int idxLst ;
   private long Z1216TokenId ;
   private long A1216TokenId ;
   private long ZZ1216TokenId ;
   private String sPrefix ;
   private String Z1217TokenPais ;
   private String Z1218TokenFecha ;
   private String Z1225TokenEnv ;
   private String scmdbuf ;
   private String gxfirstwebparm ;
   private String gxfirstwebparm_bkp ;
   private String GXKey ;
   private String PreviousTooltip ;
   private String PreviousCaption ;
   private String GX_FocusControl ;
   private String edtTokenId_Internalname ;
   private String divMaintable_Internalname ;
   private String divTitlecontainer_Internalname ;
   private String lblTitle_Internalname ;
   private String lblTitle_Jsonclick ;
   private String ClassString ;
   private String StyleString ;
   private String divFormcontainer_Internalname ;
   private String divToolbarcell_Internalname ;
   private String TempTags ;
   private String bttBtn_first_Internalname ;
   private String bttBtn_first_Jsonclick ;
   private String bttBtn_previous_Internalname ;
   private String bttBtn_previous_Jsonclick ;
   private String bttBtn_next_Internalname ;
   private String bttBtn_next_Jsonclick ;
   private String bttBtn_last_Internalname ;
   private String bttBtn_last_Jsonclick ;
   private String bttBtn_select_Internalname ;
   private String bttBtn_select_Jsonclick ;
   private String edtTokenId_Jsonclick ;
   private String edtTokenPais_Internalname ;
   private String A1217TokenPais ;
   private String edtTokenPais_Jsonclick ;
   private String edtTokenFecha_Internalname ;
   private String A1218TokenFecha ;
   private String edtTokenFecha_Jsonclick ;
   private String edtTokenTipo_Internalname ;
   private String edtTokenTipo_Jsonclick ;
   private String edtTokenRecibido_Internalname ;
   private String edtTokenEnv_Internalname ;
   private String A1225TokenEnv ;
   private String edtTokenEnv_Jsonclick ;
   private String bttBtn_enter_Internalname ;
   private String bttBtn_enter_Jsonclick ;
   private String bttBtn_cancel_Internalname ;
   private String bttBtn_cancel_Jsonclick ;
   private String bttBtn_delete_Internalname ;
   private String bttBtn_delete_Jsonclick ;
   private String Gx_mode ;
   private String sEvt ;
   private String EvtGridId ;
   private String EvtRowId ;
   private String sEvtType ;
   private String endTrnMsgTxt ;
   private String endTrnMsgCod ;
   private String sMode130 ;
   private String sDynURL ;
   private String FormProcess ;
   private String bodyStyle ;
   private String ZZ1217TokenPais ;
   private String ZZ1218TokenFecha ;
   private String ZZ1225TokenEnv ;
   private boolean entryPointCalled ;
   private boolean toggleJsOutput ;
   private boolean wbErr ;
   private boolean n1217TokenPais ;
   private boolean n1218TokenFecha ;
   private boolean n1220TokenTipo ;
   private boolean n1225TokenEnv ;
   private boolean n1219TokenRecibido ;
   private String A1219TokenRecibido ;
   private String Z1219TokenRecibido ;
   private String ZZ1219TokenRecibido ;
   private String Z1220TokenTipo ;
   private String A1220TokenTipo ;
   private String ZZ1220TokenTipo ;
   private IDataStoreProvider pr_localmysql ;
   private long[] T002O4_A1216TokenId ;
   private String[] T002O4_A1217TokenPais ;
   private boolean[] T002O4_n1217TokenPais ;
   private String[] T002O4_A1218TokenFecha ;
   private boolean[] T002O4_n1218TokenFecha ;
   private String[] T002O4_A1220TokenTipo ;
   private boolean[] T002O4_n1220TokenTipo ;
   private String[] T002O4_A1219TokenRecibido ;
   private boolean[] T002O4_n1219TokenRecibido ;
   private String[] T002O4_A1225TokenEnv ;
   private boolean[] T002O4_n1225TokenEnv ;
   private long[] T002O5_A1216TokenId ;
   private long[] T002O3_A1216TokenId ;
   private String[] T002O3_A1217TokenPais ;
   private boolean[] T002O3_n1217TokenPais ;
   private String[] T002O3_A1218TokenFecha ;
   private boolean[] T002O3_n1218TokenFecha ;
   private String[] T002O3_A1220TokenTipo ;
   private boolean[] T002O3_n1220TokenTipo ;
   private String[] T002O3_A1219TokenRecibido ;
   private boolean[] T002O3_n1219TokenRecibido ;
   private String[] T002O3_A1225TokenEnv ;
   private boolean[] T002O3_n1225TokenEnv ;
   private long[] T002O6_A1216TokenId ;
   private long[] T002O7_A1216TokenId ;
   private long[] T002O2_A1216TokenId ;
   private String[] T002O2_A1217TokenPais ;
   private boolean[] T002O2_n1217TokenPais ;
   private String[] T002O2_A1218TokenFecha ;
   private boolean[] T002O2_n1218TokenFecha ;
   private String[] T002O2_A1220TokenTipo ;
   private boolean[] T002O2_n1220TokenTipo ;
   private String[] T002O2_A1219TokenRecibido ;
   private boolean[] T002O2_n1219TokenRecibido ;
   private String[] T002O2_A1225TokenEnv ;
   private boolean[] T002O2_n1225TokenEnv ;
   private IDataStoreProvider pr_default ;
   private long[] T002O11_A1216TokenId ;
   private com.genexus.webpanels.GXWebForm Form ;
}

final  class token__localmysql extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
          new ForEachCursor("T002O2", "SELECT `TokenId`, `TokenPais`, `TokenFecha`, `TokenTipo`, `TokenRecibido`, `TokenEnv` FROM `token` WHERE `TokenId` = ?  FOR UPDATE ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O3", "SELECT `TokenId`, `TokenPais`, `TokenFecha`, `TokenTipo`, `TokenRecibido`, `TokenEnv` FROM `token` WHERE `TokenId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O4", "SELECT TM1.`TokenId`, TM1.`TokenPais`, TM1.`TokenFecha`, TM1.`TokenTipo`, TM1.`TokenRecibido`, TM1.`TokenEnv` FROM `token` TM1 WHERE TM1.`TokenId` = ? ORDER BY TM1.`TokenId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O5", "SELECT `TokenId` FROM `token` WHERE `TokenId` = ? ",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,false )
         ,new ForEachCursor("T002O6", "SELECT `TokenId` FROM `token` WHERE ( `TokenId` > ?) ORDER BY `TokenId`  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new ForEachCursor("T002O7", "SELECT `TokenId` FROM `token` WHERE ( `TokenId` < ?) ORDER BY `TokenId` DESC  LIMIT 1",true, GX_NOMASK, false, this,1, GxCacheFrequency.OFF,true )
         ,new UpdateCursor("T002O8", "INSERT INTO `token`(`TokenId`, `TokenPais`, `TokenFecha`, `TokenTipo`, `TokenRecibido`, `TokenEnv`) VALUES(?, ?, ?, ?, ?, ?)", GX_NOMASK)
         ,new UpdateCursor("T002O9", "UPDATE `token` SET `TokenPais`=?, `TokenFecha`=?, `TokenTipo`=?, `TokenRecibido`=?, `TokenEnv`=?  WHERE `TokenId` = ?", GX_NOMASK)
         ,new UpdateCursor("T002O10", "DELETE FROM `token`  WHERE `TokenId` = ?", GX_NOMASK)
         ,new ForEachCursor("T002O11", "SELECT `TokenId` FROM `token` ORDER BY `TokenId` ",true, GX_NOMASK, false, this,100, GxCacheFrequency.OFF,false )
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getLongVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 1 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getLongVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 2 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               ((String[]) buf[1])[0] = rslt.getString(2, 2);
               ((boolean[]) buf[2])[0] = rslt.wasNull();
               ((String[]) buf[3])[0] = rslt.getString(3, 50);
               ((boolean[]) buf[4])[0] = rslt.wasNull();
               ((String[]) buf[5])[0] = rslt.getVarchar(4);
               ((boolean[]) buf[6])[0] = rslt.wasNull();
               ((String[]) buf[7])[0] = rslt.getLongVarchar(5);
               ((boolean[]) buf[8])[0] = rslt.wasNull();
               ((String[]) buf[9])[0] = rslt.getString(6, 3);
               ((boolean[]) buf[10])[0] = rslt.wasNull();
               return;
            case 3 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 4 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 5 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
            case 9 :
               ((long[]) buf[0])[0] = rslt.getLong(1);
               return;
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
            case 0 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 1 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 2 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 3 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 4 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 5 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
            case 6 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               if ( ((Boolean) parms[1]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.CHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[2], 2);
               }
               if ( ((Boolean) parms[3]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.CHAR );
               }
               else
               {
                  stmt.setString(3, (String)parms[4], 50);
               }
               if ( ((Boolean) parms[5]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(4, (String)parms[6], 40);
               }
               if ( ((Boolean) parms[7]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.VARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(5, (String)parms[8]);
               }
               if ( ((Boolean) parms[9]).booleanValue() )
               {
                  stmt.setNull( 6 , Types.CHAR );
               }
               else
               {
                  stmt.setString(6, (String)parms[10], 3);
               }
               return;
            case 7 :
               if ( ((Boolean) parms[0]).booleanValue() )
               {
                  stmt.setNull( 1 , Types.CHAR );
               }
               else
               {
                  stmt.setString(1, (String)parms[1], 2);
               }
               if ( ((Boolean) parms[2]).booleanValue() )
               {
                  stmt.setNull( 2 , Types.CHAR );
               }
               else
               {
                  stmt.setString(2, (String)parms[3], 50);
               }
               if ( ((Boolean) parms[4]).booleanValue() )
               {
                  stmt.setNull( 3 , Types.VARCHAR );
               }
               else
               {
                  stmt.setVarchar(3, (String)parms[5], 40);
               }
               if ( ((Boolean) parms[6]).booleanValue() )
               {
                  stmt.setNull( 4 , Types.VARCHAR );
               }
               else
               {
                  stmt.setLongVarchar(4, (String)parms[7]);
               }
               if ( ((Boolean) parms[8]).booleanValue() )
               {
                  stmt.setNull( 5 , Types.CHAR );
               }
               else
               {
                  stmt.setString(5, (String)parms[9], 3);
               }
               stmt.setLong(6, ((Number) parms[10]).longValue());
               return;
            case 8 :
               stmt.setLong(1, ((Number) parms[0]).longValue());
               return;
      }
   }

   public String getDataStoreName( )
   {
      return "LOCALMYSQL";
   }

}

final  class token__default extends DataStoreHelperBase implements ILocalDataStoreHelper
{
   public Cursor[] getCursors( )
   {
      return new Cursor[] {
      };
   }

   public void getResults( int cursor ,
                           IFieldGetter rslt ,
                           Object[] buf ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

   public void setParameters( int cursor ,
                              IFieldSetter stmt ,
                              Object[] parms ) throws SQLException
   {
      switch ( cursor )
      {
      }
   }

}

