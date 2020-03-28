package com.complise.encuesta.api.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name = "respuestas")
public class Respuesta implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String usuario;
	private String estatus;
	@Size( max = 1)
	private String respuesta001;
	@Size( max = 1)
	private String respuesta002;
	@Size( max = 1)
	private String respuesta003;
	@Size( max = 1)
	private String respuesta004;
	@Size( max = 1)
	private String respuesta005;
	@Size( max = 5)
	private String respuesta006;
	@Size( max = 5)
	private String respuesta007;
	@Size( max = 5)
	private String respuesta008;
	@Size( max = 5)
	private String respuesta009;
	@Size( max = 5)
	private String respuesta010;
	@Size( max = 5)
	private String respuesta011;
	@Size( max = 5)
	private String respuesta012;
	@Size( max = 5)
	private String respuesta013;
	@Size( max = 5)
	private String respuesta014;
	@Size( max = 5)
	private String respuesta015;
	@Size( max = 5)
	private String respuesta016;
	@Size( max = 5)
	private String respuesta017;
	@Size( max = 5)
	private String respuesta018;
	@Size( max = 5)
	private String respuesta019;
	@Size( max = 5)
	private String respuesta020;
	@Size( max = 5)
	private String respuesta021;
	@Size( max = 5)
	private String respuesta022;
	@Size( max = 5)
	private String respuesta023;
	@Size( max = 5)
	private String respuesta024;
	@Size( max = 5)
	private String respuesta025;
	@Size( max = 5)
	private String respuesta026;
	@Size( max = 5)
	private String respuesta027;
	@Size( max = 5)
	private String respuesta028;
	@Size( max = 5)
	private String respuesta029;
	@Size( max = 5)
	private String respuesta030;
	@Size( max = 5)
	private String respuesta031;
	@Size( max = 5)
	private String respuesta032;
	@Size( max = 5)
	private String respuesta033;
	@Size( max = 5)
	private String respuesta034;
	@Size( max = 5)
	private String respuesta035;
	@Size( max = 5)
	private String respuesta036;
	@Size( max = 5)
	private String respuesta037;
	@Size( max = 5)
	private String respuesta038;
	@Size( max = 5)
	private String respuesta039;
	@Size( max = 5)
	private String respuesta040;
	@Size( max = 5)
	private String respuesta041;
	@Size( max = 5)
	private String respuesta042;
	@Size( max = 5)
	private String respuesta043;
	@Size( max = 5)
	private String respuesta044;
	@Size( max = 5)
	private String respuesta045;
	@Size( max = 5)
	private String respuesta046;
	@Size( max = 5)
	private String respuesta047;
	@Size( max = 5)
	private String respuesta048;
	@Size( max = 5)
	private String respuesta049;
	@Size( max = 5)
	private String respuesta050;
	@Size( max = 5)
	private String respuesta051;
	@Size( max = 5)
	private String respuesta052;
	@Size( max = 5)
	private String respuesta053;
	@Size( max = 5)
	private String respuesta054;
	@Size( max = 5)
	private String respuesta055;
	@Size( max = 5)
	private String respuesta056;
	@Size( max = 5)
	private String respuesta057;
	@Size( max = 5)
	private String respuesta058;
	@Size( max = 5)
	private String respuesta059;
	@Size( max = 5)
	private String respuesta060;
	@Size( max = 5)
	private String respuesta061;
	@Size( max = 5)
	private String respuesta062;
	@Size( max = 5)
	private String respuesta063;
	@Size( max = 5)
	private String respuesta064;
	@Size( max = 5)
	private String respuesta065;
	@Size( max = 5)
	private String respuesta066;
	@Size( max = 5)
	private String respuesta067;
	@Size( max = 5)
	private String respuesta068;
	@Size( max = 5)
	private String respuesta069;
	@Size( max = 5)
	private String respuesta070;
	@Size( max = 5)
	private String respuesta071;
	@Size( max = 5)
	private String respuesta072;
	@Size( max = 5)
	private String respuesta073;
	@Size( max = 5)
	private String respuesta074;
	@Size( max = 5)
	private String respuesta075;
	@Size( max = 5)
	private String respuesta076;
	@Size( max = 5)
	private String respuesta077;
	@Size( max = 5)
	private String respuesta078;
	@Size( max = 5)
	private String respuesta079;
	@Size( max = 5)
	private String respuesta080;
	@Size( max = 5)
	private String respuesta081;
	@Size( max = 5)
	private String respuesta082;
	@Size( max = 5)
	private String respuesta083;
	@Size( max = 5)
	private String respuesta084;
	@Size( max = 5)
	private String respuesta085;
	@Size( max = 5)
	private String respuesta086;
	@Size( max = 5)
	private String respuesta087;
	@Size( max = 5)
	private String respuesta088;
	@Size( max = 5)
	private String respuesta089;
	@Size( max = 5)
	private String respuesta090;
	@Size( max = 5)
	private String respuesta091;
	@Size( max = 5)
	private String respuesta092;
	@Size( max = 5)
	private String respuesta093;
	@Size( max = 5)
	private String respuesta094;
	@Size( max = 5)
	private String respuesta095;
	@Size( max = 5)
	private String respuesta096;
	@Size( max = 5)
	private String respuesta097;
	@Size( max = 5)
	private String respuesta098;
	@Size( max = 5)
	private String respuesta099;
	@Size( max = 5)
	private String respuesta100;
	@Size( max = 5)
	private String respuesta101;
	@Size( max = 5)
	private String respuesta102;
	@Size( max = 5)
	private String respuesta103;
	@Size( max = 5)
	private String respuesta104;
	@Size( max = 5)
	private String respuesta105;
	@Size( max = 5)
	private String respuesta106;
	@Size( max = 5)
	private String respuesta107;
	@Size( max = 5)
	private String respuesta108;
	@Size( max = 5)
	private String respuesta109;
	@Size( max = 5)
	private String respuesta110;
	@Size( max = 5)
	private String respuesta111;
	@Size( max = 5)
	private String respuesta112;
	@Size( max = 5)
	private String respuesta113;
	@Size( max = 5)
	private String respuesta114;
	@Size( max = 5)
	private String respuesta115;
	@Size( max = 5)
	private String respuesta116;
	@Size( max = 5)
	private String respuesta117;
	@Size( max = 5)
	private String respuesta118;
	@Size( max = 5)
	private String respuesta119;
	@Size( max = 5)
	private String respuesta120;
	@Size( max = 5)
	private String respuesta121;
	private String respuesta122;
	private String respuesta123;
	private String respuesta124;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getEstatus() {
		return estatus;
	}

	public void setEstatus(String estatus) {
		this.estatus = estatus;
	}

	public String getRespuesta001() {
		return respuesta001;
	}

	public void setRespuesta001(String respuesta001) {
		this.respuesta001 = respuesta001;
	}

	public String getRespuesta002() {
		return respuesta002;
	}

	public void setRespuesta002(String respuesta002) {
		this.respuesta002 = respuesta002;
	}

	public String getRespuesta003() {
		return respuesta003;
	}

	public void setRespuesta003(String respuesta003) {
		this.respuesta003 = respuesta003;
	}

	public String getRespuesta004() {
		return respuesta004;
	}

	public void setRespuesta004(String respuesta004) {
		this.respuesta004 = respuesta004;
	}

	public String getRespuesta005() {
		return respuesta005;
	}

	public void setRespuesta005(String respuesta005) {
		this.respuesta005 = respuesta005;
	}

	public String getRespuesta006() {
		return respuesta006;
	}

	public void setRespuesta006(String respuesta006) {
		this.respuesta006 = respuesta006;
	}

	public String getRespuesta007() {
		return respuesta007;
	}

	public void setRespuesta007(String respuesta007) {
		this.respuesta007 = respuesta007;
	}

	public String getRespuesta008() {
		return respuesta008;
	}

	public void setRespuesta008(String respuesta008) {
		this.respuesta008 = respuesta008;
	}

	public String getRespuesta009() {
		return respuesta009;
	}

	public void setRespuesta009(String respuesta009) {
		this.respuesta009 = respuesta009;
	}

	public String getRespuesta010() {
		return respuesta010;
	}

	public void setRespuesta010(String respuesta010) {
		this.respuesta010 = respuesta010;
	}

	public String getRespuesta011() {
		return respuesta011;
	}

	public void setRespuesta011(String respuesta011) {
		this.respuesta011 = respuesta011;
	}

	public String getRespuesta012() {
		return respuesta012;
	}

	public void setRespuesta012(String respuesta012) {
		this.respuesta012 = respuesta012;
	}

	public String getRespuesta013() {
		return respuesta013;
	}

	public void setRespuesta013(String respuesta013) {
		this.respuesta013 = respuesta013;
	}

	public String getRespuesta014() {
		return respuesta014;
	}

	public void setRespuesta014(String respuesta014) {
		this.respuesta014 = respuesta014;
	}

	public String getRespuesta015() {
		return respuesta015;
	}

	public void setRespuesta015(String respuesta015) {
		this.respuesta015 = respuesta015;
	}

	public String getRespuesta016() {
		return respuesta016;
	}

	public void setRespuesta016(String respuesta016) {
		this.respuesta016 = respuesta016;
	}

	public String getRespuesta017() {
		return respuesta017;
	}

	public void setRespuesta017(String respuesta017) {
		this.respuesta017 = respuesta017;
	}

	public String getRespuesta018() {
		return respuesta018;
	}

	public void setRespuesta018(String respuesta018) {
		this.respuesta018 = respuesta018;
	}

	public String getRespuesta019() {
		return respuesta019;
	}

	public void setRespuesta019(String respuesta019) {
		this.respuesta019 = respuesta019;
	}

	public String getRespuesta020() {
		return respuesta020;
	}

	public void setRespuesta020(String respuesta020) {
		this.respuesta020 = respuesta020;
	}

	public String getRespuesta021() {
		return respuesta021;
	}

	public void setRespuesta021(String respuesta021) {
		this.respuesta021 = respuesta021;
	}

	public String getRespuesta022() {
		return respuesta022;
	}

	public void setRespuesta022(String respuesta022) {
		this.respuesta022 = respuesta022;
	}

	public String getRespuesta023() {
		return respuesta023;
	}

	public void setRespuesta023(String respuesta023) {
		this.respuesta023 = respuesta023;
	}

	public String getRespuesta024() {
		return respuesta024;
	}

	public void setRespuesta024(String respuesta024) {
		this.respuesta024 = respuesta024;
	}

	public String getRespuesta025() {
		return respuesta025;
	}

	public void setRespuesta025(String respuesta025) {
		this.respuesta025 = respuesta025;
	}

	public String getRespuesta026() {
		return respuesta026;
	}

	public void setRespuesta026(String respuesta026) {
		this.respuesta026 = respuesta026;
	}

	public String getRespuesta027() {
		return respuesta027;
	}

	public void setRespuesta027(String respuesta027) {
		this.respuesta027 = respuesta027;
	}

	public String getRespuesta028() {
		return respuesta028;
	}

	public void setRespuesta028(String respuesta028) {
		this.respuesta028 = respuesta028;
	}

	public String getRespuesta029() {
		return respuesta029;
	}

	public void setRespuesta029(String respuesta029) {
		this.respuesta029 = respuesta029;
	}

	public String getRespuesta030() {
		return respuesta030;
	}

	public void setRespuesta030(String respuesta030) {
		this.respuesta030 = respuesta030;
	}

	public String getRespuesta031() {
		return respuesta031;
	}

	public void setRespuesta031(String respuesta031) {
		this.respuesta031 = respuesta031;
	}

	public String getRespuesta032() {
		return respuesta032;
	}

	public void setRespuesta032(String respuesta032) {
		this.respuesta032 = respuesta032;
	}

	public String getRespuesta033() {
		return respuesta033;
	}

	public void setRespuesta033(String respuesta033) {
		this.respuesta033 = respuesta033;
	}

	public String getRespuesta034() {
		return respuesta034;
	}

	public void setRespuesta034(String respuesta034) {
		this.respuesta034 = respuesta034;
	}

	public String getRespuesta035() {
		return respuesta035;
	}

	public void setRespuesta035(String respuesta035) {
		this.respuesta035 = respuesta035;
	}

	public String getRespuesta036() {
		return respuesta036;
	}

	public void setRespuesta036(String respuesta036) {
		this.respuesta036 = respuesta036;
	}

	public String getRespuesta037() {
		return respuesta037;
	}

	public void setRespuesta037(String respuesta037) {
		this.respuesta037 = respuesta037;
	}

	public String getRespuesta038() {
		return respuesta038;
	}

	public void setRespuesta038(String respuesta038) {
		this.respuesta038 = respuesta038;
	}

	public String getRespuesta039() {
		return respuesta039;
	}

	public void setRespuesta039(String respuesta039) {
		this.respuesta039 = respuesta039;
	}

	public String getRespuesta040() {
		return respuesta040;
	}

	public void setRespuesta040(String respuesta040) {
		this.respuesta040 = respuesta040;
	}

	public String getRespuesta041() {
		return respuesta041;
	}

	public void setRespuesta041(String respuesta041) {
		this.respuesta041 = respuesta041;
	}

	public String getRespuesta042() {
		return respuesta042;
	}

	public void setRespuesta042(String respuesta042) {
		this.respuesta042 = respuesta042;
	}

	public String getRespuesta043() {
		return respuesta043;
	}

	public void setRespuesta043(String respuesta043) {
		this.respuesta043 = respuesta043;
	}

	public String getRespuesta044() {
		return respuesta044;
	}

	public void setRespuesta044(String respuesta044) {
		this.respuesta044 = respuesta044;
	}

	public String getRespuesta045() {
		return respuesta045;
	}

	public void setRespuesta045(String respuesta045) {
		this.respuesta045 = respuesta045;
	}

	public String getRespuesta046() {
		return respuesta046;
	}

	public void setRespuesta046(String respuesta046) {
		this.respuesta046 = respuesta046;
	}

	public String getRespuesta047() {
		return respuesta047;
	}

	public void setRespuesta047(String respuesta047) {
		this.respuesta047 = respuesta047;
	}

	public String getRespuesta048() {
		return respuesta048;
	}

	public void setRespuesta048(String respuesta048) {
		this.respuesta048 = respuesta048;
	}

	public String getRespuesta049() {
		return respuesta049;
	}

	public void setRespuesta049(String respuesta049) {
		this.respuesta049 = respuesta049;
	}

	public String getRespuesta050() {
		return respuesta050;
	}

	public void setRespuesta050(String respuesta050) {
		this.respuesta050 = respuesta050;
	}

	public String getRespuesta051() {
		return respuesta051;
	}

	public void setRespuesta051(String respuesta051) {
		this.respuesta051 = respuesta051;
	}

	public String getRespuesta052() {
		return respuesta052;
	}

	public void setRespuesta052(String respuesta052) {
		this.respuesta052 = respuesta052;
	}

	public String getRespuesta053() {
		return respuesta053;
	}

	public void setRespuesta053(String respuesta053) {
		this.respuesta053 = respuesta053;
	}

	public String getRespuesta054() {
		return respuesta054;
	}

	public void setRespuesta054(String respuesta054) {
		this.respuesta054 = respuesta054;
	}

	public String getRespuesta055() {
		return respuesta055;
	}

	public void setRespuesta055(String respuesta055) {
		this.respuesta055 = respuesta055;
	}

	public String getRespuesta056() {
		return respuesta056;
	}

	public void setRespuesta056(String respuesta056) {
		this.respuesta056 = respuesta056;
	}

	public String getRespuesta057() {
		return respuesta057;
	}

	public void setRespuesta057(String respuesta057) {
		this.respuesta057 = respuesta057;
	}

	public String getRespuesta058() {
		return respuesta058;
	}

	public void setRespuesta058(String respuesta058) {
		this.respuesta058 = respuesta058;
	}

	public String getRespuesta059() {
		return respuesta059;
	}

	public void setRespuesta059(String respuesta059) {
		this.respuesta059 = respuesta059;
	}

	public String getRespuesta060() {
		return respuesta060;
	}

	public void setRespuesta060(String respuesta060) {
		this.respuesta060 = respuesta060;
	}

	public String getRespuesta061() {
		return respuesta061;
	}

	public void setRespuesta061(String respuesta061) {
		this.respuesta061 = respuesta061;
	}

	public String getRespuesta062() {
		return respuesta062;
	}

	public void setRespuesta062(String respuesta062) {
		this.respuesta062 = respuesta062;
	}

	public String getRespuesta063() {
		return respuesta063;
	}

	public void setRespuesta063(String respuesta063) {
		this.respuesta063 = respuesta063;
	}

	public String getRespuesta064() {
		return respuesta064;
	}

	public void setRespuesta064(String respuesta064) {
		this.respuesta064 = respuesta064;
	}

	public String getRespuesta065() {
		return respuesta065;
	}

	public void setRespuesta065(String respuesta065) {
		this.respuesta065 = respuesta065;
	}

	public String getRespuesta066() {
		return respuesta066;
	}

	public void setRespuesta066(String respuesta066) {
		this.respuesta066 = respuesta066;
	}

	public String getRespuesta067() {
		return respuesta067;
	}

	public void setRespuesta067(String respuesta067) {
		this.respuesta067 = respuesta067;
	}

	public String getRespuesta068() {
		return respuesta068;
	}

	public void setRespuesta068(String respuesta068) {
		this.respuesta068 = respuesta068;
	}

	public String getRespuesta069() {
		return respuesta069;
	}

	public void setRespuesta069(String respuesta069) {
		this.respuesta069 = respuesta069;
	}

	public String getRespuesta070() {
		return respuesta070;
	}

	public void setRespuesta070(String respuesta070) {
		this.respuesta070 = respuesta070;
	}

	public String getRespuesta071() {
		return respuesta071;
	}

	public void setRespuesta071(String respuesta071) {
		this.respuesta071 = respuesta071;
	}

	public String getRespuesta072() {
		return respuesta072;
	}

	public void setRespuesta072(String respuesta072) {
		this.respuesta072 = respuesta072;
	}

	public String getRespuesta073() {
		return respuesta073;
	}

	public void setRespuesta073(String respuesta073) {
		this.respuesta073 = respuesta073;
	}

	public String getRespuesta074() {
		return respuesta074;
	}

	public void setRespuesta074(String respuesta074) {
		this.respuesta074 = respuesta074;
	}

	public String getRespuesta075() {
		return respuesta075;
	}

	public void setRespuesta075(String respuesta075) {
		this.respuesta075 = respuesta075;
	}

	public String getRespuesta076() {
		return respuesta076;
	}

	public void setRespuesta076(String respuesta076) {
		this.respuesta076 = respuesta076;
	}

	public String getRespuesta077() {
		return respuesta077;
	}

	public void setRespuesta077(String respuesta077) {
		this.respuesta077 = respuesta077;
	}

	public String getRespuesta078() {
		return respuesta078;
	}

	public void setRespuesta078(String respuesta078) {
		this.respuesta078 = respuesta078;
	}

	public String getRespuesta079() {
		return respuesta079;
	}

	public void setRespuesta079(String respuesta079) {
		this.respuesta079 = respuesta079;
	}

	public String getRespuesta080() {
		return respuesta080;
	}

	public void setRespuesta080(String respuesta080) {
		this.respuesta080 = respuesta080;
	}

	public String getRespuesta081() {
		return respuesta081;
	}

	public void setRespuesta081(String respuesta081) {
		this.respuesta081 = respuesta081;
	}

	public String getRespuesta082() {
		return respuesta082;
	}

	public void setRespuesta082(String respuesta082) {
		this.respuesta082 = respuesta082;
	}

	public String getRespuesta083() {
		return respuesta083;
	}

	public void setRespuesta083(String respuesta083) {
		this.respuesta083 = respuesta083;
	}

	public String getRespuesta084() {
		return respuesta084;
	}

	public void setRespuesta084(String respuesta084) {
		this.respuesta084 = respuesta084;
	}

	public String getRespuesta085() {
		return respuesta085;
	}

	public void setRespuesta085(String respuesta085) {
		this.respuesta085 = respuesta085;
	}

	public String getRespuesta086() {
		return respuesta086;
	}

	public void setRespuesta086(String respuesta086) {
		this.respuesta086 = respuesta086;
	}

	public String getRespuesta087() {
		return respuesta087;
	}

	public void setRespuesta087(String respuesta087) {
		this.respuesta087 = respuesta087;
	}

	public String getRespuesta088() {
		return respuesta088;
	}

	public void setRespuesta088(String respuesta088) {
		this.respuesta088 = respuesta088;
	}

	public String getRespuesta089() {
		return respuesta089;
	}

	public void setRespuesta089(String respuesta089) {
		this.respuesta089 = respuesta089;
	}

	public String getRespuesta090() {
		return respuesta090;
	}

	public void setRespuesta090(String respuesta090) {
		this.respuesta090 = respuesta090;
	}

	public String getRespuesta091() {
		return respuesta091;
	}

	public void setRespuesta091(String respuesta091) {
		this.respuesta091 = respuesta091;
	}

	public String getRespuesta092() {
		return respuesta092;
	}

	public void setRespuesta092(String respuesta092) {
		this.respuesta092 = respuesta092;
	}

	public String getRespuesta093() {
		return respuesta093;
	}

	public void setRespuesta093(String respuesta093) {
		this.respuesta093 = respuesta093;
	}

	public String getRespuesta094() {
		return respuesta094;
	}

	public void setRespuesta094(String respuesta094) {
		this.respuesta094 = respuesta094;
	}

	public String getRespuesta095() {
		return respuesta095;
	}

	public void setRespuesta095(String respuesta095) {
		this.respuesta095 = respuesta095;
	}

	public String getRespuesta096() {
		return respuesta096;
	}

	public void setRespuesta096(String respuesta096) {
		this.respuesta096 = respuesta096;
	}

	public String getRespuesta097() {
		return respuesta097;
	}

	public void setRespuesta097(String respuesta097) {
		this.respuesta097 = respuesta097;
	}

	public String getRespuesta098() {
		return respuesta098;
	}

	public void setRespuesta098(String respuesta098) {
		this.respuesta098 = respuesta098;
	}

	public String getRespuesta099() {
		return respuesta099;
	}

	public void setRespuesta099(String respuesta099) {
		this.respuesta099 = respuesta099;
	}

	public String getRespuesta100() {
		return respuesta100;
	}

	public void setRespuesta100(String respuesta100) {
		this.respuesta100 = respuesta100;
	}

	public String getRespuesta101() {
		return respuesta101;
	}

	public void setRespuesta101(String respuesta101) {
		this.respuesta101 = respuesta101;
	}

	public String getRespuesta102() {
		return respuesta102;
	}

	public void setRespuesta102(String respuesta102) {
		this.respuesta102 = respuesta102;
	}

	public String getRespuesta103() {
		return respuesta103;
	}

	public void setRespuesta103(String respuesta103) {
		this.respuesta103 = respuesta103;
	}

	public String getRespuesta104() {
		return respuesta104;
	}

	public void setRespuesta104(String respuesta104) {
		this.respuesta104 = respuesta104;
	}

	public String getRespuesta105() {
		return respuesta105;
	}

	public void setRespuesta105(String respuesta105) {
		this.respuesta105 = respuesta105;
	}

	public String getRespuesta106() {
		return respuesta106;
	}

	public void setRespuesta106(String respuesta106) {
		this.respuesta106 = respuesta106;
	}

	public String getRespuesta107() {
		return respuesta107;
	}

	public void setRespuesta107(String respuesta107) {
		this.respuesta107 = respuesta107;
	}

	public String getRespuesta108() {
		return respuesta108;
	}

	public void setRespuesta108(String respuesta108) {
		this.respuesta108 = respuesta108;
	}

	public String getRespuesta109() {
		return respuesta109;
	}

	public void setRespuesta109(String respuesta109) {
		this.respuesta109 = respuesta109;
	}

	public String getRespuesta110() {
		return respuesta110;
	}

	public void setRespuesta110(String respuesta110) {
		this.respuesta110 = respuesta110;
	}

	public String getRespuesta111() {
		return respuesta111;
	}

	public void setRespuesta111(String respuesta111) {
		this.respuesta111 = respuesta111;
	}

	public String getRespuesta112() {
		return respuesta112;
	}

	public void setRespuesta112(String respuesta112) {
		this.respuesta112 = respuesta112;
	}

	public String getRespuesta113() {
		return respuesta113;
	}

	public void setRespuesta113(String respuesta113) {
		this.respuesta113 = respuesta113;
	}

	public String getRespuesta114() {
		return respuesta114;
	}

	public void setRespuesta114(String respuesta114) {
		this.respuesta114 = respuesta114;
	}

	public String getRespuesta115() {
		return respuesta115;
	}

	public void setRespuesta115(String respuesta115) {
		this.respuesta115 = respuesta115;
	}

	public String getRespuesta116() {
		return respuesta116;
	}

	public void setRespuesta116(String respuesta116) {
		this.respuesta116 = respuesta116;
	}

	public String getRespuesta117() {
		return respuesta117;
	}

	public void setRespuesta117(String respuesta117) {
		this.respuesta117 = respuesta117;
	}

	public String getRespuesta118() {
		return respuesta118;
	}

	public void setRespuesta118(String respuesta118) {
		this.respuesta118 = respuesta118;
	}

	public String getRespuesta119() {
		return respuesta119;
	}

	public void setRespuesta119(String respuesta119) {
		this.respuesta119 = respuesta119;
	}

	public String getRespuesta120() {
		return respuesta120;
	}

	public void setRespuesta120(String respuesta120) {
		this.respuesta120 = respuesta120;
	}

	public String getRespuesta121() {
		return respuesta121;
	}

	public void setRespuesta121(String respuesta121) {
		this.respuesta121 = respuesta121;
	}

	public String getRespuesta122() {
		return respuesta122;
	}

	public void setRespuesta122(String respuesta122) {
		this.respuesta122 = respuesta122;
	}

	public String getRespuesta123() {
		return respuesta123;
	}

	public void setRespuesta123(String respuesta123) {
		this.respuesta123 = respuesta123;
	}

	public String getRespuesta124() {
		return respuesta124;
	}

	public void setRespuesta124(String respuesta124) {
		this.respuesta124 = respuesta124;
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
