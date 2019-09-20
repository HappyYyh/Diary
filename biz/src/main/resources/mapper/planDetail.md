sample
===
* 注释

	select #use("cols")# from tbl_plan_detail  where  #use("condition")#

cols
===
	id,plan_id,plan_name,input_type,remark,status,is_delete,gmt_create,gmt_update

updateSample
===
	
	id=#id#,plan_id=#planId#,plan_name=#planName#,input_type=#inputType#,remark=#remark#,status=#status#,is_delete=#isDelete#,gmt_create=#gmtCreate#,gmt_update=#gmtUpdate#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(planId)){
	 and plan_id=#planId#
	@}
	@if(!isEmpty(planName)){
	 and plan_name=#planName#
	@}
	@if(!isEmpty(inputType)){
	 and input_type=#inputType#
	@}
	@if(!isEmpty(remark)){
	 and remark=#remark#
	@}
	@if(!isEmpty(status)){
	 and status=#status#
	@}
	@if(!isEmpty(isDelete)){
	 and is_delete=#isDelete#
	@}
	@if(!isEmpty(gmtCreate)){
	 and gmt_create=#gmtCreate#
	@}
	@if(!isEmpty(gmtUpdate)){
	 and gmt_update=#gmtUpdate#
	@}
	
	