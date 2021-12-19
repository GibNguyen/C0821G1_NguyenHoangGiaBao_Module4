<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Thông tin tờ khai y tế</title>
</head>
<body>
<h2>Thông tin tờ khai y tế</h2>
<p>Họ tên : <c:out value="${toKhaiYTe.hoTen}"/></p>
<p>Năm sinh : <c:out value="${toKhaiYTe.namSinh}"/></p>
<p>Giới tính : <c:out value="${toKhaiYTe.gioiTinh}"/></p>
<p>Quốc tịch : <c:out value="${toKhaiYTe.quocTich}"/></p>
<p>Số Cmnd : <c:out value="${toKhaiYTe.soCMND}"/></p>
<p>Thông tin đi lại : <c:out value="${toKhaiYTe.thongTinDiLai}"/></p>
<p>Biển số xe : <c:out value="${toKhaiYTe.bienSoXe}"/></p>
<p>Số ghế : <c:out value="${mtoKhaiYTe.soGhe}"/></p>
<p>Ngày khởi hành : <c:out value="${toKhaiYTe.ngayKhoiHanh}"/></p>
<p>Ngày kết thúc : <c:out value="${toKhaiYTe.ngayKetThuc}"/></p>
<p>Mô tả thêm : <c:out value="${toKhaiYTe.moTa}"/></p>
<p>Địa chỉ liên lạc : <c:out value="${toKhaiYTe.diaChiLienLac}"/></p>
<p>Địa chỉ nơi ở : <c:out value="${toKhaiYTe.diaChiNoiO}"/></p>
<p>Số điện thoại : <c:out value="${toKhaiYTe.soDienThoai}"/></p>
<p>Email : <c:out value="${toKhaiYTe.email}"/></p>
<p>Triệu Chứng : <c:out value="${toKhaiYTe.trieuChung}"/></p>
<p>Lịch sử phơi nhiễm : <c:out value="${toKhaiYTe.lichSuPhoiNhiem}"/></p>


</body>
</html>
