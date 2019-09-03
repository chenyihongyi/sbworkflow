select
p.NAME as project_name,
b.id as agency_id,
b.NAME as agency_id,
r.id_t_month_report,
p.Id as projectId,
r.report_type,
r.activity_state,
r.month_date,
r.project_support_type,
r.area_support_type,
r.strategy_support_type,
r.other_support_type,
CASE WHEN activity_state not in(2,4) THEN 0 ELSE 1 END as fill,
(SELECT vt.result from t_comment vt when vt.id_t_month_report = r.id_t_month_report and vt.role_type = "PROJECT_TEAM") as projectResult,
(SELECT vt.result from t_comment vt when vt.id_t_month_report = r.id_t_month_report and vt.role_type = "AREA") as areaResult,
(SELECT vt.result from t_comment vt when vt.id_t_month_report = r.id_t_month_report and vt.role_type = "STRATEGY_SUPPORT") as strategyResult,
FROM
projects p
LEFT JOIN t_month_report r ON p.id = r.project_id
LEFT JOIN businessunits b ON b.id = r.agency_id
LEFT JOIN projectbusinessunits pb ON pb.ProjectId = p.id
where 1 = 1
<if test="projectId ! = '' and projectId ! = null">
and p.id = #{projectId}
</if>
<if test="agencyName ! = '' and agencyName ! = null">
and b.NAME LIKE CONCAT('%', #{agencyName}, '%')
</if>

select
id_t_month_report as reportId,
month_date
from
t_month_report
where 1 = 1
and project_id = #{projectId}
and agency_id = #{agencyId}
and month_date >=date_format(now(), '%Y-%01-%01')

select
p.id as projectId,
LEFT(pl.DATE,4) as yearDate,
SUBSTRING(pl.DATE, 6, 2) as month,
FROM
projects p
LEFT JOIN projectbusinessunitmembers pbm ON p.id = pbm.projectId
LEFT JOIN t_month_report r ON p.id = r.project_id
where 1= 1
<if test = "projectId !=null">
and p.id = #{projectId}
</if>
























