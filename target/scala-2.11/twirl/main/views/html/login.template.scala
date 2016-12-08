
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object login_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class login extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template1[Form[models.users.Login],play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*2.2*/(loginForm: Form[models.users.Login]):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {
import helper._

Seq[Any](format.raw/*2.39*/("""
"""),format.raw/*4.1*/("""

"""),_display_(/*6.2*/main("Login")/*6.15*/ {_display_(Seq[Any](format.raw/*6.17*/("""
  """),format.raw/*7.3*/("""<!-- HTML content for the index view -->

      <div class="col-xs-4">
          <h3>Sign in</h3>
          """),_display_(/*11.12*/if(loginForm.hasGlobalErrors)/*11.41*/{_display_(Seq[Any](format.raw/*11.42*/("""
              """),format.raw/*12.15*/("""<p class="alert alert-warning">
              """),_display_(/*13.16*/loginForm/*13.25*/.globalError.message),format.raw/*13.45*/("""
              """),format.raw/*14.15*/("""</p>
          """)))}),format.raw/*15.12*/("""
          """),_display_(/*16.12*/if(flash.containsKey("error"))/*16.42*/{_display_(Seq[Any](format.raw/*16.43*/("""
              """),format.raw/*17.15*/("""<div class="alert alert-warning">
                  """),_display_(/*18.20*/flash/*18.25*/.get("loginRequired")),format.raw/*18.46*/("""
                  """),format.raw/*19.19*/("""</div>
          """)))}),format.raw/*20.12*/("""
        """),_display_(/*21.10*/helper/*21.16*/.form(action = controllers.routes.LoginController.loginSubmit())/*21.80*/{_display_(Seq[Any](format.raw/*21.81*/("""
            """),format.raw/*22.13*/("""<div class="form-group">
                """),_display_(/*23.18*/inputText(loginForm("email"), '_label -> "",
                'class -> "form-control input -xs", 'placeholder -> "Email")),format.raw/*24.77*/("""
                """),format.raw/*25.17*/("""</div>
            <div class="form-group">
                """),_display_(/*27.18*/inputPassword(loginForm("password"),'_label -> "",
                    'class -> "form-control input -xs", 'placeholder -> "Password")),format.raw/*28.84*/("""
            """),format.raw/*29.13*/("""</div>
            <div class="form-group">
                <input type="submit" value="Sign In" class="btn btn-primary">
                    </div>

        """)))}),format.raw/*34.10*/("""
      """),format.raw/*35.7*/("""</div>
""")))}),format.raw/*36.2*/("""
  """),format.raw/*37.3*/("""<!-- End of content for main -->
"""))
      }
    }
  }

  def render(loginForm:Form[models.users.Login]): play.twirl.api.HtmlFormat.Appendable = apply(loginForm)

  def f:((Form[models.users.Login]) => play.twirl.api.HtmlFormat.Appendable) = (loginForm) => apply(loginForm)

  def ref: this.type = this

}


}

/**/
object login extends login_Scope0.login
              /*
                  -- GENERATED --
                  DATE: Thu Dec 08 12:48:51 GMT 2016
                  SOURCE: /home/wdd/webapps/lab11/playlab_crud-part4/app/views/login.scala.html
                  HASH: 95de4894fb46ef12f9a4575d8ee856b71332069d
                  MATRIX: 763->2|910->39|937->57|965->60|986->73|1025->75|1054->78|1190->187|1228->216|1267->217|1310->232|1384->279|1402->288|1443->308|1486->323|1533->339|1572->351|1611->381|1650->382|1693->397|1773->450|1787->455|1829->476|1876->495|1925->513|1962->523|1977->529|2050->593|2089->594|2130->607|2199->649|2341->770|2386->787|2474->848|2629->982|2670->995|2860->1154|2894->1161|2932->1169|2962->1172
                  LINES: 27->2|32->2|33->4|35->6|35->6|35->6|36->7|40->11|40->11|40->11|41->12|42->13|42->13|42->13|43->14|44->15|45->16|45->16|45->16|46->17|47->18|47->18|47->18|48->19|49->20|50->21|50->21|50->21|50->21|51->22|52->23|53->24|54->25|56->27|57->28|58->29|63->34|64->35|65->36|66->37
                  -- GENERATED --
              */
          