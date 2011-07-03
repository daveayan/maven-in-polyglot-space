# This is a mojo description
# @goal "sayhi"
# @phase "validate"
# @requiresDependencyResolution "compile"
class JrubyMojo < Mojo

  # @parameter type="java.lang.String" default-value="nothing" alias="prop3"
  def prop;;end

  # @parameter type="org.apache.maven.project.MavenProject" expression=>"${project}" alias="prop3"
  # @required true
  def project;;end

  def execute
    info "Hello from ruby plugin"
    info "My project artifact is: #{$project.artifactId}"
  end
end

run_mojo JrubyMojo