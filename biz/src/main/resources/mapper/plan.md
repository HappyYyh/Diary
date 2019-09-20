sample
===
* 注释

	select #use("cols")# from tbl_plan  where  #use("condition")#

cols
===
	id,user_id,plan_group_name,plan_group_type,remark,status,is_delete,gmt_create,gmt_update

updateSample
===
	
	id=#id#,user_id=#userId#,plan_group_name=#planGroupName#,plan_group_type=#planGroupType#,remark=#remark#,status=#status#,is_delete=#isDelete#,gmt_create=#gmtCreate#,gmt_update=#gmtUpdate#

condition
===

	1 = 1  
	@if(!isEmpty(id)){
	 and id=#id#
	@}
	@if(!isEmpty(userId)){
	 and user_id=#userId#
	@}
	@if(!isEmpty(planGroupName)){
	 and plan_group_name=#planGroupName#
	@}
	@if(!isEmpty(planGroupType)){
	 and plan_group_type=#planGroupType#
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
	
	