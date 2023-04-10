(function (AJS, $) {
  $(function () {
    console.log(">>>>>>> custom-error-general-resources <<<<<<<");
    const $requestAccessContainer = $('.request-access-container');
    if ($requestAccessContainer.length > 0) {
      console.log(">>>>>>> request-access-container <<<<<<<");
      $('.request-access', $requestAccessContainer).append('<h3>####### 권한이 없는 페이지 입니다. #######<h3>');
    }
    const $pageInTrashContainer = $('#page-intrash-container');
    if ($pageInTrashContainer.length > 0) {
      console.log(">>>>>>> page-intrash-container <<<<<<<");
      $pageInTrashContainer.append('<div class="page-intrash-message">####### 삭제된 페이지 입니다. #######</div>');
    }
  });
})(AJS, AJS.$ || jquery);