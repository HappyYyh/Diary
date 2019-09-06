sample
===
* 注释

	select #use("cols")# from tbl_user  where  #use("condition")#

cols
===
	id,real_name,nick_name,phone,password,salt,head_img,role_id,status,gmt_create,gmt_update

updateSample
===
	
	id=#id#,real_name=#realName#,nick_name=#nickName#,phone=#phone#,password=#password#,salt=#salt#,head_img=#headImg#,role_id=#roleId#,status=#status#,gmt_create=#gmtCreate#,gmt_update=#gmtUpdate#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(realName)){
	 and real_name=#realName#
	@}
	@if(!isEmpty(nickName)){
	 and nick_name=#nickName#
	@}
	@if(!isEmpty(phone)){
	 and phone=#phone#
	@}
	@if(!isEmpty(password)){
	 and password=#password#
	@}
	@if(!isEmpty(salt)){
	 and salt=#salt#
	@}
	@if(!isEmpty(headImg)){
	 and head_img=#headImg#
	@}
	@if(!isEmpty(roleId)){
	 and role_id=#roleId#
	@}
	@if(!isEmpty(status)){
	 and status=#status#
	@}
	@if(!isEmpty(gmtCreate)){
	 and gmt_create=#gmtCreate#
	@}
	@if(!isEmpty(gmtUpdate)){
	 and gmt_update=#gmtUpdate#
	@}
	
	