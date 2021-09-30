/*
               File: accounts.StructSdtOwner
        Description: Owner
             Author: GeneXus Java Generator version 17_0_1-147395
       Generated on: August 30, 2021 18:15:24.23
       Program type: Callable routine
          Main DBMS: DB2 for iSeries
*/
package com.b2brestv1.accounts ;
import com.genexus.*;

public final  class StructSdtOwner implements Cloneable, java.io.Serializable
{
   public StructSdtOwner( )
   {
      gxTv_SdtOwner_Email = "" ;
      gxTv_SdtOwner_Firstname = "" ;
      gxTv_SdtOwner_Lastname = "" ;
      gxTv_SdtOwner_Phone = "" ;
   }

   public Object clone()
   {
      Object cloned = null;
      try
      {
         cloned = super.clone();
      }catch (CloneNotSupportedException e){ ; }
      return cloned;
   }

   public String getEmail( )
   {
      return gxTv_SdtOwner_Email ;
   }

   public void setEmail( String value )
   {
      gxTv_SdtOwner_Email = value ;
   }

   public String getFirstname( )
   {
      return gxTv_SdtOwner_Firstname ;
   }

   public void setFirstname( String value )
   {
      gxTv_SdtOwner_Firstname = value ;
   }

   public String getLastname( )
   {
      return gxTv_SdtOwner_Lastname ;
   }

   public void setLastname( String value )
   {
      gxTv_SdtOwner_Lastname = value ;
   }

   public String getPhone( )
   {
      return gxTv_SdtOwner_Phone ;
   }

   public void setPhone( String value )
   {
      gxTv_SdtOwner_Phone = value ;
   }

   protected String gxTv_SdtOwner_Email ;
   protected String gxTv_SdtOwner_Firstname ;
   protected String gxTv_SdtOwner_Lastname ;
   protected String gxTv_SdtOwner_Phone ;
}

